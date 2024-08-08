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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){return null;}
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int rot=k%len;
        for(int i=0;i<rot;i++)
        {
            temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            ListNode last=temp.next;
            temp.next=null;
            last.next=head;
            head=last;
        }
        return head;
    }
}