/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Map<Integer, Integer> inorderMp;
    int postIndex;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       inorderMp = new HashMap<>();
       
       for(int i=0; i<inorder.length; i++) inorderMp.put(inorder[i], i);
       
       postIndex = postorder.length - 1;
       
       return helperFunc(postorder, 0, inorder.length-1);
    }

    private TreeNode helperFunc(int[] postorder, int left, int right){
        
        if(left > right) return null;

        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);

        int mid = inorderMp.get(rootValue);

        root.right = helperFunc(postorder, mid + 1, right);
        root.left = helperFunc(postorder, left, mid - 1);
        

        return root;
    }
}