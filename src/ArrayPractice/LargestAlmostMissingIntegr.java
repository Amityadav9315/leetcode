package ArrayPractice;

public class LargestAlmostMissingIntegr {

    import java.util.*;

    public class Solution {
        public int largestInteger(int[] nums, int k){
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i <= nums.length - k; i++) {
                Set<Integer> uniqueInWindow = new HashSet<>();
                for (int j = i; j < i + k; j++) {
                    uniqueInWindow.add(nums[j]);
                }

                for (int num : uniqueInWindow) {
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                }
            }


            int largest = -1;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    largest = Math.max(largest, entry.getKey());
                }
            }

            return largest;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();


            int[] nums1 = {3, 9, 2, 1, 7};
            int k1 = 3;
            System.out.println(solution.largestInteger(nums1, k1));


        }
    }

}
