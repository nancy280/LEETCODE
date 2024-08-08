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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ZigZag= new ArrayList<>();
        if(root==null)
        return ZigZag;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean left=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> ar =new ArrayList<Integer>();
            for(int i=1;i<=size;i++)
            {
              	TreeNode temp=q.poll();
              	if(temp.left!=null){
                  	q.add(temp.left);
              	} 
              	if(temp.right!=null){
                  	q.add(temp.right);
              	}
			  	ar.add(temp.val);
            }
			if(left){
				ZigZag.add(ar);
			}
			else{
				Collections.reverse(ar);
				ZigZag.add(ar);
			}

			left=!left;
        }
        return ZigZag;
    }
}