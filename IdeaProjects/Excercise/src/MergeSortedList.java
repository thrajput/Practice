/**
 * Created by Tarun on 7/23/2017.
 */
public class MergeSortedList {

    /**
     * Definition for singly-linked list.
     */
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result=new ListNode(-1);
            ListNode head=result;

            while(l1!=null && l2!=null)
            {
                if(l1.val< l2.val)
                {
                    result.next=l1;
                    l1=l1.next;

                }
                else
                {
                    result.next=l2;
                    l2=l2.next;
                }
                result=result.next;


            }
            ListNode remaining=null;
            if(l1!=null)
                remaining=l1;
            if(l2!=null)
                remaining=l2;
            while (remaining!=null)
            {
                result.next=remaining;
                remaining=remaining.next;
                result=result.next;
            }
            return head.next;

        }
    }


}
