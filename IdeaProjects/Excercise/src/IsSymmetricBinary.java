/**
 * Created by Tarun on 7/14/2017.
 */
public class IsSymmetricBinary {


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

        public boolean symmetrichelp(TreeNode left,TreeNode right)
        {

            if(left==null || right==null)
                return left==right;
            else if(left.val==right.val)
                return (symmetrichelp(left.left,right.right) && symmetrichelp(left.right,right.left));
            else
                return false;
        }
        public boolean isSymmetric(TreeNode root) {
            if(root==null)
                return true;
            else
                return symmetrichelp(root.left,root.right);
        }



}
