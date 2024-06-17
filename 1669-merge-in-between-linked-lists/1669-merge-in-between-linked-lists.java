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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=temp1.next;
        int i=0;
        int diff=b-a;
        while(diff>=1)
        {
            temp2=temp2.next;
            diff--;
        }
        while(i<a-1)
        {
            temp1=temp1.next;
            temp2=temp2.next;
            i++;
        }
        temp2=temp2.next;
        
        temp1.next=list2;
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=temp2;
        return list1;
    }
}