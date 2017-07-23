import java.util.Stack;

/**
 * Created by Tarun on 7/23/2017.
 */
public class QueueUsingStack {

    public class MyQueue {

        Stack<Integer> stack;
        Stack<Integer> stack2;
        /** Initialize your data structure here. */
        public MyQueue() {
            stack=new Stack<Integer>();
            stack2=new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack.push(x);

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return stack2.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(stack2.empty())
                while(!stack.empty())
                    stack2.push(stack.pop());
            return  stack2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return (stack2.empty() && stack.empty());
        }
    }



}
