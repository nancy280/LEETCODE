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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxdepth(root);
        return max;
    }
    public int maxdepth(TreeNode root)
    {
        if(root==null)
        return 0;

        int l=maxdepth(root.left);
        int r=maxdepth(root.right);
        max=Math.max(l+r,max);

        return Math.max(l,r)+1;
    }
}