import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of test case");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Entre the value of x");

            int x=sc.nextInt();
            System.out.println("Entre the value of y");
            int y=sc.nextInt();
            if(x<y){
                System.out.println("0");
            }
            else{
                System.out.println(x/y);
            }
        }


        // your code goes here

    }
}
