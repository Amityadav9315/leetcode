import java.util.Scanner;

class FindMaxArea {
    // Function to calculate the maximum area
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;  // Starting pointer from the left side
        int right = height.length - 1;  // Starting pointer from the right side

        // Use two-pointer technique to find the maximum area
        while (left < right) {
            // Calculate the area between the left and right pointers
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            // Move the pointer which points to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        FindMaxArea solution = new FindMaxArea();


        int result = solution.maxArea(arr);
        System.out.println("Maximum area: " + result);
    }
}
