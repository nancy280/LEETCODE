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

    public int maxPathSum(TreeNode root) {
        max=root.val;
        maxsum(root);
        return max;
    }
    public int maxsum(TreeNode root)
    {
       if(root==null)
       return 0;

       int l=maxsum(root.left);
       int r=maxsum(root.right);

       max=Math.max(max,l+r+root.val);
       max=Math.max(max, root.val+l);
       max=Math.max(max, root.val+r);
       max=Math.max(max, root.val);

       return Math.max(root.val,Math.max(l,r)+root.val);
    }
}