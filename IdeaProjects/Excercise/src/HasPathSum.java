/**
 * Created by Tarun on 7/11/2017.
 */
public class HasPathSum {
  public class Solution {

      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

      public boolean hasPathSum(TreeNode root, int sum) {
          if(root==null)
              return false;
          if((sum-root.val)==0 && root.left==null && root.right==null)
              return  true;
          if((sum-root.val)!=0 && root.left==null && root.right==null)
              return false;
          return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
      }
    }


}
