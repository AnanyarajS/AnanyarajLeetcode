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
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null || head.next==null)
    return head;
    ListNode curr = head;
    int i=0;
    int n = length(head);
    k = k%n;
    if(k==0)
    return head;
     while(i<n-k-1){
        curr = curr.next;
        i++;
     }
     ListNode newlist = curr.next;
     ListNode li = curr.next;
     while(newlist.next!=null)
     newlist = newlist.next;
    curr.next = null;
    newlist.next = head;
    return li;
    }

}