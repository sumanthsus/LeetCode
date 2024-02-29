package Feb20;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recur(res,"",0,0,n);
        return res;
    }

    public void recur(List<String> res,String currentString, int open, int close, int max)
    {
        if(currentString.length() == max*2)
        {
            res.add(currentString);
            return;
        }

        if(open<max)
             recur(res, currentString+"(",open+1,close,max);
        if(close<open)
            recur(res, currentString+")",open,close+1,max);
    }

    public static void main(String[] args)
    {
        GenerateParantheses gn = new GenerateParantheses();

        System.out.println(gn.generateParenthesis(4).toString());
    }
}
