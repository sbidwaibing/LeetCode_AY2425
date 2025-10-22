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
        if(lists.length == 0) return null;
        return divQ(lists, 0, lists.length - 1);
    }

    private ListNode divQ(ListNode[] lists, int left, int right){
        
        if(left == right) return lists[left];

        int mid = (left + right) / 2;
        
        ListNode l1 = divQ(lists, left, mid);
        ListNode l2 = divQ(lists, mid + 1, right);

        return mergeLists(l1, l2);
    }

    private ListNode mergeLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeLists(l1, l2.next);
            return l2;
        }
    }

}