// LeetCode, Add Two Numbers
// Author: Xie Tianyu(xiety0001@gmail.com)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int carry = 0;

        ListNode ptr = dummy;
        for (ListNode pa = l1, pb = l2;
                pa != null || pb != null;
                pa = pa == null ? null : pa.next,
                pb = pb == null ? null : pb.next,
                ptr = ptr.next) {

            int ai = pa == null ? 0 : pa.val;
            int bi = pb == null ? 0 : pb.val;
            int value = (ai + bi + carry) % 10;
            carry = (ai + bi + carry) / 10;
            ptr.next = new ListNode(value);
        }

        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] argc) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(0);

        Solution s = new Solution();
        ListNode ptr = s.addTwoNumbers(l1, l2);
        while (ptr != null) {
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }
}

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
