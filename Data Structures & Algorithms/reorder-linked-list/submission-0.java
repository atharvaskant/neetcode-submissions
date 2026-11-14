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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null) {
            return;
        }

        // middle node

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is middle node

        ListNode h1 = head;
        ListNode h2 = reverseList(slow);


        while(h2 != null && h2.next != null) {
            ListNode temp1 = h1.next;
        ListNode temp2 = h2.next;

        h1.next = h2;
        h2.next = temp1;

        h1 = temp1;
        h2 = temp2;
        }
        
    }

    ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
