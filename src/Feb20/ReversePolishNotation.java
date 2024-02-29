package Feb20;

import java.util.Stack;

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<Integer>();
        int firstoper=0,secondoper=0;
        for(int i=0;i<tokens.length;i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {

                System.out.println(stk);
                secondoper = stk.pop();
                firstoper = stk.pop();

                if(tokens[i] == "+")
                {
                    stk.push(firstoper+secondoper);
                }
                if(tokens[i] == "-")
                {
                    stk.push(firstoper-secondoper);
                }
                if(tokens[i] == "*")
                {
                    stk.push(firstoper*secondoper);
                }
                if(tokens[i] == "/")
                {
                    stk.push(firstoper/secondoper);
                }


            }
            else {
                stk.push(Integer.valueOf(tokens[i]));
            }
        }
        return stk.pop();
    }

    public static void main(String[] args)
    {
        ReversePolishNotation rp = new ReversePolishNotation();
        String[] arr = new String[]{"2","1","+","3","*"};
        System.out.println("result : " + rp.evalRPN(arr));
    }
}
