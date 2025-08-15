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
   static int length(ListNode head){
    int count = 0;
    ListNode curr = head;
    while(curr!=null){
        count++;
        curr = curr.next;
    }
return count;
   }
    public ListNode removeNthFromEnd(ListNode head, int n) {
                int len = length(head);
        if(head.next==null){
            return null;
        }
        if(len==n){
            return head.next;
        }

        ListNode curr = head;
        int i = 0;
        while(i<len-n-1){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
}