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
    public ListNode modifiedList(int[] nums, ListNode head) {

        ListNode prev = null;
        ListNode next = head.next;
        ListNode result = null;

        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums) hs.add(num);
        
        while(head != null)
        {
            if(hs.contains(head.val)){
            
                if(prev != null) prev.next = head.next;
                else prev = head;

                head = head.next;
                if(next != null) next = next.next;
            }
            else
            {
                prev = head;
                head = head.next;//
                if(next != null) next = next.next;
                if(result == null) result = prev;
            }
        }

        return result;
    }
}