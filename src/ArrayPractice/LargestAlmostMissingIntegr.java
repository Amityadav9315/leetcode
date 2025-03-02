package ArrayPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestAlmostMissingIntegr {

    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Sliding window approach to process all subarrays of size k
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> uniqueInWindow = new HashSet<>();

            // Add elements of the current subarray to a Set to ensure uniqueness
            for (int j = i; j < i + k; j++) {
                uniqueInWindow.add(nums[j]);
            }

            // Update the countMap to track how many subarrays each element appeared in
            for (int num : uniqueInWindow) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        // Find the largest integer that appears exactly once in the subarrays
        int largest = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                largest = Math.max(largest, entry.getKey());
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        LargestAlmostMissingIntegr solution = new LargestAlmostMissingIntegr();

        // Example 1
        int[] nums1 = {3, 9, 2, 1, 7};
        int k1 = 3;
        System.out.println(solution.largestInteger(nums1, k1));  // Output: 7

        // Example 2
        int[] nums2 = {3, 9, 7, 2};
        int k2 = 3;
        System.out.println(solution.largestInteger(nums2, k2));  // Output: 7
    }
}
