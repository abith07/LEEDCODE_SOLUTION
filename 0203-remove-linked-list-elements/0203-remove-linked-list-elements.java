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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans=new ListNode(-1);
        ListNode res=ans;
        while(head!=null){
            if(head.val==val){

            
            head=head.next;
        }
        else{
            res.next=head;
            res=res.next;
            head=head.next;
        }
        }
        res.next=null;
        return ans.next;
            

        
     
        
    }
}