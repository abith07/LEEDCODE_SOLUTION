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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry=0;
        ListNode ans=new ListNode(-1);
        ListNode head=ans;
        while(l1!=null || l2!=null)
        {
            int digit1=0,digit2=0;
            if(l1!=null)
            {
                digit1=l1.val;
                l1=l1.next;
            }
             if(l2!=null)
            {
                digit2=l2.val;
                l2=l2.next;
            }
            int x=(digit1+digit2+carry)%10;
            carry=(digit1+digit2+carry)/10;
            ans.next=new ListNode(x);
            ans=ans.next;
            
            

        }
        if(carry==1){ans.next=new ListNode(1);}
        return head.next;
}
}