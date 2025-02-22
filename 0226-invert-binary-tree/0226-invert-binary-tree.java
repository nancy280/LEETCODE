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
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
    public TreeNode invert(TreeNode n1)
    {
        if(n1==null)
        return null;

        TreeNode temp=invert(n1.right);
        n1.right=invert(n1.left);
        n1.left=temp;

        return n1;
    }
}