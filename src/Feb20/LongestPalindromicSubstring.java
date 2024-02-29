package Feb20;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        int reslen=0;
        int l,r, lim1=0,lim2=0;
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            l=i;r=i;

            System.out.println("ch["+l+"] : " + ch[l]+ " ch[" +r+"]:" + ch[r] + " i : " + i +" length : "+ch.length);

            while(l>=0 && r<ch.length && ch[l]==ch[r])
            {

                System.out.println("lim1 :" + lim1 + " lim2 : " + lim2 + " l :" + l +" r : " + r + " reslen : " + reslen);
                if(reslen<r-l+1)
                {
                    reslen = r-l+1;
                    lim1=l;
                    lim2=r;
                }
                l-=1;
                r+=1;

            }
            l=i;r=i+1;

            while(l>=0 && r<ch.length && ch[l]==ch[r])
            {

                System.out.println("lim1 :" + lim1 + " lim2 : " + lim2 + " l :" + l +" r : " + r + " reslen : " + reslen);
                if(reslen<r-l+1)
                {
                    reslen = r-l+1;
                    lim1=l;
                    lim2=r;
                }
                l-=1;
                r+=1;

            }


        }

        /*for(int i=lim1;i<=lim2;i++)
        {
            res.append(ch[i]);
        }
        System.out.println(res);*/
        return s.substring(lim1, lim2 + 1);

        /*char[] str = s.toCharArray();
        if(s.isEmpty() || s.length()==1)
        {
            return s;
        }

        for(int i=0;i<str.length;i++)
        {
            for(int j=str.length-1;j>i;j--)
            {
                System.out.println("str["+i+"] : " + str[i] +" str["+j+"] : " + str[j]);
                if(str[i]==str[j])
                {
                    //System.out.println("str["+i+"] : " + str[i] +" str["+j+"] : " + str[j]);
                    String res = PalindromeCheck(str,i,j);
                    if(!res.equals("nope"))
                    {
                        return res;
                    }
                }
            }
            if(i==str.length-1)
                return String.valueOf(str[i]);
        }


        return "";*/
    }
/*
    public String PalindromeCheck(char[] ch, int i,int j)
    {


        /*int tempi=i,tempj=j;
        while(tempi<tempj)
        {
            tempi+=1;
            tempj-=1;
            System.out.println("ch["+i+"] : " + ch[i] +" ch["+j+"] : " + ch[j]);
            if(ch[tempi]!=ch[tempj])
            {
                return "nope";
            }
        }
        StringBuilder res = new StringBuilder();
        for(int x=i;x<=j;x++ )
        {
            res.append(ch[x]);
        }
        return res.toString();*/


    public static void main(String[] args)
    {
        LongestPalindromicSubstring ls = new LongestPalindromicSubstring();
        System.out.println(ls.longestPalindrome("abb"));
    }
}
