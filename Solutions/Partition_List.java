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

    public ListNode partition(ListNode head, int x) {
     ListNode curr = head;
     ListNode dummy = new ListNode(0);
     ListNode node = dummy;
     while(curr!=null){
        if(curr.val<x){
            node.next = new ListNode(curr.val);
            node = node.next;
        }
        curr = curr.next;
     }
     ListNode n = head;
     while(n!=null){
        if(n.val>=x){
            node.next = new ListNode(n.val);
            node = node.next;
        }
        n = n.next;

     }
     return dummy.next;

    }
}