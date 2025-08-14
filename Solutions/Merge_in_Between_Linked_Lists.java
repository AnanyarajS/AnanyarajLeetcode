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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
          ListNode before = list1;
          int i = 0;
          while(i<a-1){
              before = before.next;
              i++;
          }
        ListNode after = before;
          while(i<b){
            after = after.next;
            i++;
          }
          after = after.next;
          before.next = list2;
          while(list2.next!=null){
            list2 = list2.next;
          }
          list2.next = after;
          return list1;
          

        }
    }
