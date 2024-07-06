import java.util.*;
public class Countingprettynumber {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int m=sc.nextInt();
                int count = 0;

                for (int i = n; i <= m; i++) {
                    int c=i%10;
                    if(c==2||c==3||c==9){
                        count++;
                    }
                }

                System.out.println(count);
            }


        }
    }


