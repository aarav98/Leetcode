/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
 */
package solution;

public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
	        return isMirror(root,root);
	 }
	 private boolean isMirror(TreeNode l, TreeNode r){
	        if(l == null && r == null) return true;
	        if(l!=null && r!=null && l.val == r.val) return (isMirror(l.right,r.left) && isMirror(l.left,r.right));
	        return false;
	 }
}
