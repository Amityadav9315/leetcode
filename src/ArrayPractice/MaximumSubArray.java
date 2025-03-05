package ArrayPractice;

import java.util.Scanner;

public class MaximumSubArray {
        public int maxSubArray(int[] nums) {
            int n=nums.length;
            int sum=0;
            int max=0;

            for(int i=0; i<n; i++){
                for(int j=i; j<n; j++){
                    if()
                        sum=sum+nums[j];
                    if(sum>max){
                        max=sum;
                    }
                }
                sum=0;
            }
            return max;

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; )

    }
    }
}
