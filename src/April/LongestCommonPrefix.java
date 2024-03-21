package April;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int len = 999999999,index=0;
        /*for(int i=0;i<strs.length;i++)
        {
            if(len>strs[i].length())
            {
                len=strs[i].length();
                index=i;
            }
        }*/
        String str = strs[index];
        System.out.println(str);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            for(String other:strs)
            {
                System.out.println("str.charAt : " +str.charAt(i) + " Other : " + other.length() + " i : " + i);
                if(i==other.length()) return res.toString();
                if(str.charAt(i) != other.charAt(i) )
                {
                    return res.toString();
                }


            }
            res.append(str.charAt(i));
        }

        return res.toString();
    }

    public static void main(String[] args)
    {
        LongestCommonPrefix lp = new LongestCommonPrefix();
        String[] strs = new String[]{"ab","a"};

        System.out.println(lp.longestCommonPrefix(strs));
    }
}
