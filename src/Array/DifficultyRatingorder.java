package Array;

import java.util.Scanner;

public class DifficultyRatingorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        int count = 0;
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();

        }
        for (int i = 0; i <d.length-1; i++) {
            if (d[i] <= d[i + 1]) {
                count++;
            }
        }
            if (count == n - 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }


        }

        // Your code goes here
    }





