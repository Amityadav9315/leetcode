import java.util.*;
public class CardRemoval{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int count=0;
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (arr[i] != arr[j]) {
                        count++;

                    }
                    if(count<n){
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }

