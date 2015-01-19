// LeetCode, Two Sum
// Author: Xie Tianyu(xiety0001@gmail.com)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < numbers.length; ++i) {
            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], new ArrayList<Integer>());
            }
            map.get(numbers[i]).add(i);
        }

        for (int i = 0; i < numbers.length; ++i) {
            int gap = target - numbers[i];
            if (map.containsKey(gap)) {
                for (int j : map.get(gap)) {
                    if (j > i) {
                        return new int[] { i + 1, j + 1};
                    }
                }
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
