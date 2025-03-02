package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TransferArrayByParity {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int[] result=new int[n];
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                result[i]=0;
            }
            else{
                result[i]=1;
            }
        }
        Arrays.sort(result);

        for(int x:result){
            System.out.print(x+" ");
        }



    }


}
