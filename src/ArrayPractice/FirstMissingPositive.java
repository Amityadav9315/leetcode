package ArrayPractice;

import java.util.Scanner;

public class FirstMissingPositive {

    // Function to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] and nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function and print the result
        int result = firstMissingPositive(nums);
        System.out.println("First missing positive number is: " + result);

        sc.close();
    }
}
