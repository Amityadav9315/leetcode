package ArrayPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int i){
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
    }


    static  void pascalTriangle(int n){

        for(int i=0;i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }


}
