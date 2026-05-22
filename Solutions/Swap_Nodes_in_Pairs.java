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
    public ListNode swapPairs(ListNode head) { 
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode node = dummy;
        while(curr!=null && curr.next!=null){
            node.next = new ListNode(curr.next.val);
            node = node.next;
            node.next = new ListNode(curr.val);
            node = node.next;
            curr = curr.next.next;
        }
        if(curr!=null) node.next = new ListNode(curr.val);
        return dummy.next;

               
    }
}