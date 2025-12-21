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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;
      ListNode curr1 = l1;
      ListNode curr2 = l2;
      int carry = 0;
      while(curr1!=null && curr2!=null){
        curr.next = new ListNode(curr1.val+curr2.val+carry);
        if(curr.next.val>=10){
            carry = curr.next.val/10;
            curr.next.val-=10;
        }else carry = 0;
        curr = curr.next;
        curr1 = curr1.next;
        curr2 = curr2.next;
      }
      while(curr1!=null){
        curr.next = new ListNode(curr1.val+carry);
        if(curr.next.val>=10){
            carry = curr.next.val/10;
            curr.next.val-=10;
        }else carry = 0;
        curr = curr.next;
        curr1 = curr1.next;
      }
      while(curr2!=null){
        curr.next = new ListNode(curr2.val+carry);
        if(curr.next.val>=10){
            carry = curr.next.val/10;
            curr.next.val-=10;
        }else carry = 0;
        curr = curr.next;
        curr2 = curr2.next;
      }
      if(carry>0) 
      curr.next = new ListNode(carry);
      return dummy.next;
      

    }
}