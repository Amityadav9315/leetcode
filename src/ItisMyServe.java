import java.util.*;
import java.lang.*;
import java.io.*;

class ItisMyServe
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

            int p=sc.nextInt();
            int q=sc.nextInt();
            int c=(p+q)/2;

            if(c%2==0){
                System.out.println("Alice");

            }
            else{
                System.out.println("Bob");
            }
        }
        // your code goes here

    }

