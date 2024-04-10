package April;

public class MaximumDepthVPs {

    public int maxDepth(String s) {

        char[] ch1 = s.toCharArray();
        int local=0,max=0;
        for(char ch:ch1)
        {
            if(ch=='(')
                local++;
            else if(ch==')')
                local--;
            max=Math.max(max,local);
        }
        return max;
    }

    public static void main(String[] args)
    {
        MaximumDepthVPs mdp = new MaximumDepthVPs();

        String s ="((1+2)*((1*2)*(2*2)))";

        System.out.println(mdp.maxDepth(s));
    }
}
