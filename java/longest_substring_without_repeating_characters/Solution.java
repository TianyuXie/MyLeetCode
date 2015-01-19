// LeetCode, Longest Substring Without Repeating Character
// Author: Xie Tianyu(xiety0001@gmail.com)

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mapping = new HashMap<Character, Integer>();

        int start = 0, max_len = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            int last = mapping.get(c) == null ? -1 : mapping.get(c);
            if (last >= start) {
                max_len = Math.max(i - start, max_len);
                start = last + 1;
            }

            mapping.put(c, i);
        }

        return Math.max(s.length() - start, max_len);
    }
}
