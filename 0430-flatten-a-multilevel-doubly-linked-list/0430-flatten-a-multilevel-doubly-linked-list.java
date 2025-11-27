/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        flattenDfs(head);
        return head;
    }

    private Node flattenDfs(Node node){
        Node lastProcessed = node;

        while(node != null){
            Node next = node.next;   

            if(node.child != null){
                Node childHead = node.child;
                Node childTail = flattenDfs(childHead);

                node.next = childHead;
                childHead.prev = node;

                // Connect the end of the flattened child list back to `next`
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                node.child = null;
                lastProcessed = childTail;
            }
            else{
                lastProcessed = node;
            }
                node = next;
            }
            
        return lastProcessed;  
    }
}