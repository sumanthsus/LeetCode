package April;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class ValidParenthesis {

    public String isValid(String s) {
        /* Less Efficient approach
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Integer> open = new HashMap<>();
        HashMap<Character,Integer> close = new HashMap<>();
        open.put('(',1);open.put('{',2);open.put('[',3);
        close.put(')',1);close.put('}',2);close.put(']',3);*/

        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                    return "Not Balanced";
                char top=stack.peek();
                if((c==']'&& top=='[') || (c=='}'&&top=='{') ||(c==')'&&top=='('))
                {
                   stack.pop();
                }
                else
                    return "Not Balanced";
            }
        }

        return stack.isEmpty()? "Balanced" : "Not Balanced";

        /*char[] ch = new char[s.length()];
        int i=-1;
        for(char c :s.toCharArray())
        {
            if(c=='('||c=='{'||c=='[')
            {
                ch[++i]=c;
            }
            else
            {
                if((i>=0)&& ((ch[i]=='(' && c==')') || (ch[i]=='[' && c==']') || (ch[i]=='{' && c=='}')))
                {
                    i--;
                }
                else
                    return false;
            }
        }
        return i==-1;*/




        /*for(int i = 0;i<s.length();i++)
        {
            if(stack.isEmpty() && close.containsKey(s.charAt(i)))
            {
                return false;
            }
            //System.out.println(stack + "  ;");

            if(open.containsKey(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
            else{
                if(Objects.equals(open.get(stack.peek()), close.get(s.charAt(i))))
                {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        return stack.isEmpty();*/
    }
    public static void main(String[] args)
    {
        ValidParenthesis vs = new ValidParenthesis();
        String s = "([)";
        System.out.println(vs.isValid(s));
    }

}
