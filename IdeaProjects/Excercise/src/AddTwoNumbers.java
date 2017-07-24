/**
 * Created by Tarun on 7/24/2017.
 https://leetcode.com/problems/add-two-numbers/#/description

 */

public class AddTwoNumbers {

     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2,int carry)
    {
        if(l1==null && l2==null && carry==0)
            return null;

        int sum=0;
        if(l1!=null)
            sum+=l1.val;
        if(l2!=null)
            sum+=l2.val;
        sum+=carry;
        ListNode sumNode=new ListNode(sum%10);

        sumNode.next=addTwoNumbers((l1!=null)?l1.next:null,(l2!=null)?l2.next:null,sum/10);
        return sumNode;
    }



}




