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
    public int pairSum(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
     }
     ListNode curr = slow;
     ListNode prev = null;
     while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
     }
     ListNode temp = head;
     while(temp!=slow){
        temp = temp.next;
     }
     ListNode node = head;
     int max = 0;
     while(prev!=null){
        max = Math.max(max, node.val+prev.val);
        node = node.next;
        prev = prev.next;
     }
     return max;
    }
}