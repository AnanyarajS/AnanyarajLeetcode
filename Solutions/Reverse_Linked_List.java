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
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        if(head==null)
        return null;
        if(head.next==null)
        return head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        return prev;
    }
}