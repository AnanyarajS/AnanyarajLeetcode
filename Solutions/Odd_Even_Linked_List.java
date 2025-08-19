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
    public ListNode oddEvenList(ListNode head) {
       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;
       ListNode node = head;
       ListNode node2 = head;
       int i=1;
       int j=1;
       while(node!=null){
        if(i%2!=0){
            curr.next = new ListNode(node.val);
            curr = curr.next;
        }
        i++;
        node = node.next;
       } 
        while(node2!=null){
        if(j%2==0){
            curr.next = new ListNode(node2.val);
            curr = curr.next;
        }
        j++;
        node2 = node2.next;
       } 


   return dummy.next;

    }
}