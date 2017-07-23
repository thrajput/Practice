/**
 * Created by Tarun on 7/14/2017.
 */
public class LinkedListCycle {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }


    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode first=head;
        ListNode second=head;

        if(second.next!=null && second.next.next!=null)
            second=second.next.next;
        else
            return false;
        while(true)
        {
            if(first==second && first!=null)
                return true;
            if(second.next==null || second.next.next==null)
                return false;
            else
            {
                second=second.next.next;
                first=first.next;
            }


        }


    }


}
