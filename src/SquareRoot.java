import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enyer the no of test case");
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for( int i=1; i<=n; i++){
                if(n/i==i){
                    System.out.println(i);
                }
            }
        }
        // your code goes here

    }
}
