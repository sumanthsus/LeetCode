package Feb20;

import java.util.Stack;

public class MyQueue {
    public int prioritystack=0,poppable =1,a=0;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {

    }

    public void push(int x) {
    if(prioritystack==0)
    {
        stack1.push(x);
    }
    else
        stack2.push(x);
    }

    public int pop() {
        //if(prioritystack==0)

            if(stack2.isEmpty())
            {
                while(!stack1.isEmpty())
                {
                    a = stack1.pop();
                    stack2.push(a);
                }
            }
                return stack2.pop();
        //else
        /*
            if(stack1.isEmpty())
            {
                while(stack2.isEmpty())
                {
                    a = stack2.pop();
                    stack1.push(a);
                }
                return stack1.pop();
            }
            else
                return stack1.pop();
        */
    }

    public int peek() {
        if(stack2.isEmpty())
        {
            while (!stack1.isEmpty()) {
                a = stack1.pop();
                stack2.push(a);
            }
        }
            return stack2.peek();
    }

    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        int p=q.pop();
        q.push(5);
        q.push(6);
        int ap=q.pop();
        int pa=q.peek();

        System.out.println(p+" "+ap+" "+" "+pa);


    }
}
