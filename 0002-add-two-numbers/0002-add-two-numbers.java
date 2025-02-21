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
        ListNode sum=new ListNode();
        ListNode start=sum;
        int carry=0;
        int total=0;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                total=l2.val+carry;
                l2=l2.next;
            }
            else if(l2==null)
            {
                total=l1.val+carry;
                l1=l1.next;
            }
            else
            {
            total=l1.val+l2.val+carry;
            l2=l2.next;
            l1=l1.next;
            }

            carry=total/10;
            sum.next=new ListNode(total%10);
            sum=sum.next;
            
            
        }
        if(carry!=0)
        {
            sum.next=new ListNode(carry);
        }
        return start.next;
    }
}