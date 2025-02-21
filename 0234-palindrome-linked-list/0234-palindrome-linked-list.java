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
        while(fast!= null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=head;
        ListNode curr=slow;
        ListNode prev=null;

        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow=prev;
        while(fast!=null && slow!=null)
        {
            if(fast.val!=slow.val)
            {
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}