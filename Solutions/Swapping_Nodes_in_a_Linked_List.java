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
        ListNode curr = head;
        int count = 0;
        while(curr.next!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int n = count(head);
        int temp = 0;
        ListNode curr1 = head;
        ListNode curr2 = head;
        int i=0;
        int j=0;
        while(i<k-1){
            curr1 = curr1.next;
            i++;
        }
        while(j<n-k+1){
            curr2 = curr2.next;
            j++;
        }
        temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;
        return head;
    }
}