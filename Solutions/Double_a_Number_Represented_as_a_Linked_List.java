class Solution {
    public ListNode doubleIt(ListNode head) {
            if(head.val>=5){
                ListNode nHead = new ListNode(0);
                nHead.next = head;
                head = nHead;                
            }
            ListNode curr = head;
            while(curr!=null){
                curr.val*=2;
                if(curr.next!=null && curr.next.val>=5){
                    curr.val+=1;
                }
                curr.val = curr.val%10;
                curr = curr.next;
            }
            return head;

    }
}
/* My first solution...
class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);

        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int carry = 0;

        while (curr != null) {
            int sum = curr.val * 2 + carry;
            node.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;
            node = node.next;
        }

        if (carry > 0) {
            node.next = new ListNode(carry);
        }

        return reverse(dummy.next);
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}*/
