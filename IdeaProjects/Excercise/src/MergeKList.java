import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Tarun on 7/11/2017.
 */
public class MergeKList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0)
                return null;
            PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    if (o1.val < o2.val)
                        return -1;
                    else if (o1.val == o2.val)
                        return 0;
                    else
                        return 1;
                }
            });
            ListNode listNode = new ListNode(0);
            ListNode head = listNode;
            for (ListNode lst : lists) {
                if (lst != null)
                    pq.add(lst);

            }
            while (pq.size() > 0) {
                ListNode q = pq.poll();
                listNode.next = q;
                if (q.next != null)
                    pq.add(q.next);
                listNode = listNode.next;


            }
            return head.next;
        }
    }
}
