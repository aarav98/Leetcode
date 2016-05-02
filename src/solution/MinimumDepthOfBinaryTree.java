/*
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
package solution;

public class MinimumDepthOfBinaryTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null && root.right !=null) return 1+minDepth(root.right);
        if(root.right == null && root.left != null) return 1+minDepth(root.left);
        int lh = minDepth(root.left) + 1;
        int rh = minDepth(root.right) + 1;
        return (lh<=rh)?lh:rh;
    }
}
