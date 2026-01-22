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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
      int val = head.val-1;
      ListNode curr = head;
      ListNode next = head.next;
      ListNode dummy = new ListNode(0);
      ListNode node = dummy;
      while(next!=null){
        if(curr.val!=next.val && curr.val!=val){
            node.next = new ListNode(curr.val);
            node = node.next;
        }else{
            val = curr.val;
        }
        curr = curr.next;
        next = next.next;
      }
      if(curr.val!=val){
        node.next = new ListNode(curr.val);
      }
      return dummy.next;
        
    }
}