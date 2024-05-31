import java.util.*;
import java.lang.*;
import java.io.*;

class XJump
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number of text case");
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=x/y;
            int d=x%y;
            System.out.println(c+d);
        }

    }
}
