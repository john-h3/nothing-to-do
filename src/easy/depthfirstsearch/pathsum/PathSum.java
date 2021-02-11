package easy.depthfirstsearch.pathsum;
/**
 * PathSum
 *
 * @author john 2021/2/11
 */
public class PathSum {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
  class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
      if (root != null) {
        if (root.left == root.right) return root.val == targetSum;
        else
          return hasPathSum(root.left, targetSum - root.val)
              || hasPathSum(root.right, targetSum - root.val);
      }
      return false;
    }
  }
}
