import java.util.*;
import java.lang.*;
import java.io.*;

class WaterMixing
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(a>=b){
                int c=a-b;
                if(c<=y){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                int d=b-a;
                if(d<=x){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }


            }

        }
    }


    // your code goes here



