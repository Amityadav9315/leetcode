import java.util.*;
import java.lang.*;
import java.io.*;

class ChessBoarddistance
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int c=x1-x2;
            int d=y1-y2;
            if(x1<x2){
                c=c*(-1);
            }
            else{
                c=c*1;
            }
            if(y1<y2){
                d=d*(-1);
            }
            else{
                d=d*1;
            }

            int max=Math.max(c,d);
            System.out.println(max);


        }
        // your code goes here

    }

