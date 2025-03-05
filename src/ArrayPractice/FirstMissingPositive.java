package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive{

    static void firstmissingpositive(int[] nums,int n){

        Arrays.sort(nums);
        int count=0;
        int count1=1;
        for(int i=0; i<n; i++){
            if(nums[i]!=nums[i]+1){
                count=nums[i]+1;
                break;
            }

        }


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }


    }
    



}
