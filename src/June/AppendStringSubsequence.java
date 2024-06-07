package June;

public class AppendStringSubsequence {

    public int appendCharacters(String s, String t) {
        int ui=0,dorikindi=0;
        char[] str = s.toCharArray();
        char[] tr = t.toCharArray();
        int i=0,j=0;
        while(i<str.length&&j<tr.length){
            if(str[i]==tr[j]){
                j++;
            }
            i++;
        }
        int val=t.length()-j;
        return Math.max(val, 0);
        /*for(j=0;j<tr.length;j++)
        {
            for(i=ui;i<str.length;i++)
            {
                if(tr[j]==str[i])
                {
                    ui=i+1;
                    dorikindi=1;
                    break;
                }
            }
            if(dorikindi==0)
            {
                return tr.length-j;
            }
            dorikindi=0;
        }
        return 0;*/
    }

    public static void main(String[] args)
    {
        AppendStringSubsequence ass = new AppendStringSubsequence();
        System.out.println(ass.appendCharacters("coaching","coding"));
    }
}
