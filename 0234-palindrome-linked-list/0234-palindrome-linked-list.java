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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode p=slow;
        ListNode q=null;
        ListNode r=null;
        if(fast!=null){
            p=slow.next;

        }
        while(p!=null){
           r=q;
           q=p;
           p=p.next;
           q.next=r;

        }
        while(q!=null){
            if(head.val!=q.val){
                return false;
            }
            head=head.next;
            q=q.next;
        }
        return true;

        
        
    }
}