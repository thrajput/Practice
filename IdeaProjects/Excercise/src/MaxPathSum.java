/**
 * Created by Tarun on 7/17/2017.
 */
public class MaxPathSum {


    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    public class Solution {

        int maxValue;
        public int maxPathSum(TreeNode root) {
            maxValue=Integer.MIN_VALUE;
            int rootMax=           currenSum(root);

            return maxValue;
        }


        public int currenSum(TreeNode root)
        {
            if(root==null)
                return 0;
            int left = Math.max(0, currenSum(root.left));
            int right = Math.max(0, currenSum(root.right));
            int total = left+right+ root.val;
            maxValue = Math.max(total,maxValue);
            return Math.max(left,right)+root.val;

        }
    }
}