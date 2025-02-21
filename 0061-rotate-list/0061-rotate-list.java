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
        if(head==null || head.next==null || k==0)
        return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        k=k%size;
        
        if(k==0)return head;
        temp=head;

        k=size-k;
        while(k!=1)
        {
            temp=temp.next;
            k--;
        }
        ListNode start=temp.next;
        temp.next=null;
        temp=start;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return start;
    }
}