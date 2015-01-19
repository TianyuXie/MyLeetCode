// LeetCode, Two Sum
// Author: Xie Tianyu(xiety0001@gmail.com)

import java.util.Map;
import java.util.HashMap;

public class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; ++i) {
            int left = target - numbers[i];
            if (map.containsKey(left)) {
                return new int[] { map.get(left) + 1, i + 1 };
            } else {
                map.put(numbers[i], i);
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] argc) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println("index1 = " + result[0] + "; index2 = " + result[1]);
    }
}
