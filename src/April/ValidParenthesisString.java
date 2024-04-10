package April;

import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        char[] ch1 = s.toCharArray();
        int count=0,stars=0;

        Stack<Character> stack = new Stack<>();

        for(char ch:ch1)
        {
            /*if(stack.isEmpty()) stars=0;

            if(ch=='(') stack.push('(');
            if(ch==')') stack.pop();
            if(ch=='*') stars++;

            System.out.println(stars);*/

            if(ch=='(') {count++;stars++;}
            if(ch==')') {count--;stars--;}
            if(ch=='*') {count--;stars++;}

            System.out.println(ch + " count : " + count + " stars : " + stars);
            if(stars<0) return false;

            if(count<0) count=0;


        }

        return count==0;

        /*count= stack.size();

        System.out.println("count : " + count + "stars : " + stars);
        if(count<0) count=count*(-1);

        if(count-stars>0)   return false;

        return true;*/
    }
    public static void main(String[] args)
    {
        ValidParenthesisString vps = new ValidParenthesisString();
        String s = "***";

        System.out.println(vps.checkValidString(s));
    }
}
