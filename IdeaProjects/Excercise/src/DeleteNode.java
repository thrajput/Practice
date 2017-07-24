/**
 * Created by Tarun on 7/24/2017.
 *
 *
 *
 *
 *
 * https://leetcode.com/problems/delete-node-in-a-linked-list/#/description
 */
public class DeleteNode {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }




    public void deleteNode(ListNode node) {
        if(node.next!=null)
        {
            node.val=node.next.val;
            node.next=node.next.next;
        }
        else
            node=null;

    }

}
