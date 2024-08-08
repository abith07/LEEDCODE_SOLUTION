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
    public ListNode reverseList(ListNode head) {
        ListNode p=head;
        ListNode r=null;
        ListNode s=null;
        while(p!=null){
            s=r;
            r=p;
            p=p.next;
            r.next=s;
        }
        return r;
        
    }
}