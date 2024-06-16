import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] result = new int[2];

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return the result immediately when found
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
