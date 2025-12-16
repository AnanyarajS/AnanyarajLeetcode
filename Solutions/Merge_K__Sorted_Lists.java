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
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<lists.length;i++){
                while(lists[i]!=null){
                    pq.add(lists[i].val);
                    lists[i] = lists[i].next;
                }
            }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!pq.isEmpty()){
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }
        return dummy.next;



    }
}
   