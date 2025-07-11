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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        int length = 1;
        ListNode tempHead = head;

        // calculating the length of the LL
        while(tempHead.next != null) {
            tempHead = tempHead.next;
            length++;
        }

        k %= length;
        if (k == 0) return head;

        // Make the list circular
        tempHead.next = head;

        // Find new tail: move (length - k - 1) steps from head
        ListNode newTail = head;
        for(int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // The node next to newTail is the new head
        ListNode newHead = newTail.next;

        // Break the circle
        newTail.next = null;
        
        return newHead;
    }
}