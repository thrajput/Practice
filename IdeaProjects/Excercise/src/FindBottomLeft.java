import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Tarun on 7/1/2017.
 *
 * https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 */



public class FindBottomLeft {
 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);

        TreeNode tmp=root;

        while (!q.isEmpty())
        {
            tmp = q.poll();
            if(tmp.right!=null)
                q. offer(tmp.right);
            if(tmp.left!=null)
                q. offer(tmp.left);


        }


     return  tmp.val;
    }


}
