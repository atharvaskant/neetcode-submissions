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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode current = head;

        while(n-- > 0) {
            current = current.next;
        }

        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode iter = dummy;

        while(current != null) {
            iter = iter.next;
            current = current.next;
        }

        //dummy -> node to be removed


        ListNode remove = iter.next;

        iter.next = remove.next;
        remove.next = null;

        return dummy.next;
    }
}
