/**
 * Created by Tarun on 7/17/2017.
 */
public class PopulateNextRight {
  public class TreeLinkNode {
          int val;
          TreeLinkNode left, right, next;
          TreeLinkNode(int x) { val = x; }
  }

    public class Solution {
        public void connect(TreeLinkNode root) {
            if(root==null)
                return;


            if(root.left!=null)
                root.next=root.right;
            if(root.next!=null && root.next.left!=null)
                root.right.next=root.next.left;
            connect(root.left);
            connect(root.right);

        }
    }


}
