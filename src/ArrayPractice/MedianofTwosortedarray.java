package ArrayPractice;

import java.util.Scanner;

public class MedianofTwosortedarray {

        static void  findMedianSortedArrays(int m,int n,int[] nums1, int[] nums2) {

            int[] merge=new int[m+n];

            for(int i=0; i<m; i++){
                merge[i]=nums1[i];
            }
            for(int i=0; i<n; i++){
                merge[i+nums1.length]=nums2[i];
            }
            int sum=0;
            for(int i=0; i<merge.length; i++){
                sum=sum+merge[i];
            }
            double medium=sum/merge.length;
            System.out.println(medium);
        }

        public static   void  main(String[] args){
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[] nums1=new int[m];
            for(int i=0; i<m; i++){
                nums1[i]=sc.nextInt();
            }
            int[] nums2=new int[n];
            for(int i=0; i<n; i++){
                nums2[i]=sc.nextInt();
            }
            findMedianSortedArrays(m,n,nums1,nums2);
        }

    }


