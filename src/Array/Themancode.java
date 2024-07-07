import java.util.*;
public class Themancode {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int count1=0; int count2=0;
                for(int i=1; i<=n; i++){
                    if(i%2==0){
                        count2++;
                    }
                    else if(i%2!=0){
                        count1++;
                    }

                }
                System.out.println(count1+" "+count2);
                // your code goes here

            }
        }



