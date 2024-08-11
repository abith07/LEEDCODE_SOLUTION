/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        ListNode ss = head.next;

        while (ss != null) {
            if (temp.val == ss.val) {
                ss = ss.next;
            } else {
                temp.next = ss;
                temp = ss;
                ss = ss.next;
            }
        }

        
        temp.next = null;

        return head;
    }
}
