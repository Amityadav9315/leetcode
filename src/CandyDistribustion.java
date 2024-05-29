import java.util.*;
import java.lang.*;
import java.io.*;

class CandyDistribustion
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=n/m;
            if(c%2==0&&n%m==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
        // your code goes here

    }
}
