/**
 * Created by Tarun on 7/8/2017.
 *
 *
 */
public class FlattenBinaryTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public void flatten(TreeNode root) {

        flatHelp(root,null);








    }


    public TreeNode flatHelp(TreeNode root, TreeNode prev)
    {
        if(root==null)
            return prev;
root.right= flatHelp(root.left,flatHelp(root.right,prev));
root.left=null;




        return root;
    }


}
