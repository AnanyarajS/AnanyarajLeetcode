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
        if(head==null)
        return null;
       ListNode dummy = new ListNode(0);
       ListNode node = dummy;
       ListNode curr = head;
       while(curr!=null){
        if(curr.val!=val){
            node.next = new ListNode(curr.val);
            node = node.next;
        }
        curr = curr.next;
       }
       return dummy.next;
       }
}