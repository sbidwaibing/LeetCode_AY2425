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
    int preIndex;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       inorderMp = new HashMap<>();
       
       for(int i=0; i<inorder.length; i++) inorderMp.put(inorder[i], i);
       preIndex = 0;
       return helperFunc(preorder, 0, inorder.length-1);
    }

    private TreeNode helperFunc(int[] preorder, int left, int right){
        
        if(left > right) return null;

        int rootValue = preorder[preIndex++];
        TreeNode root = new TreeNode(rootValue);

        int mid = inorderMp.get(rootValue);

        root.left = helperFunc(preorder, left, mid - 1);
        root.right = helperFunc(preorder, mid + 1, right);

        return root;
    }
}