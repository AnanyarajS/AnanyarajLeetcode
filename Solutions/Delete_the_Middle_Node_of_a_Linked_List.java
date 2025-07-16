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
    static int lengthofList(ListNode head){
        ListNode curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        int n = lengthofList(head);
        if(n==1)
        return null;
        ListNode curr = head;
        for(int i=1;curr!=null && i<n/2;i++){
            curr = curr.next;
        }
        curr.next=curr.next.next;
        return head;        
    }
}