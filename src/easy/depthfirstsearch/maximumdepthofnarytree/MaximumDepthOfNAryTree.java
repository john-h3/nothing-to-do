package easy.depthfirstsearch.maximumdepthofnarytree;

import java.util.List;

/**
 * MaximumDepthOfNAryTree
 *
 * @author john 2021/2/11
 */
public class MaximumDepthOfNAryTree {
  class Node {
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val) {
      val = _val;
    }
    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  };

  class Solution {
    public int maxDepth(Node root) {
      if (root == null) return 0;
      if (root.children.isEmpty()) return 1;
      var max = 0;
      for (Node child : root.children) {
        max = Math.max(max,maxDepth(child));
      }
      return 1 + max;
    }
  }
}
