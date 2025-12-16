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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode present = dummy;

        while(present != null && present.next != null){
            if(present.next.val == val){
                present.next = present.next.next;
            }
            else
            {
                present = present.next;
            }
        }
        return dummy.next;
    }
}