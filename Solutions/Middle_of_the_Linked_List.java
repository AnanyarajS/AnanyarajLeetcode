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
    static int count(ListNode head){
        ListNode curr  = head;
        int count = 0;
        while(curr!=null){
        count++;
        curr = curr.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int n = count(head);
        for(int i=0;i<n/2;i++){
            curr = curr.next;
        }
        return curr;
    }
}