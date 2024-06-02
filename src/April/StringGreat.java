package April;

public class StringGreat {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        int loopcheck=0;
        for(int i=0;i<ch.length-1;i++)
        {
            if(i==0) loopcheck=0;
            System.out.println("str : " + str + " ch[i] : " + ch[i]);
            if(Character.isLowerCase(ch[i]))
            {
                if(Character.isUpperCase(ch[i+1]) && ch[i] == Character.toLowerCase(ch[i+1]))
                {
                    i=i+1;
                    loopcheck=1;
                    continue;
                }
            }
            if(Character.isUpperCase(ch[i]))
            {
                if(Character.isLowerCase(ch[i+1]) && ch[i] == Character.toUpperCase(ch[i+1]))
                {
                 i=i+1;
                 loopcheck=1;
                 continue;
                }
            }

            str.append(ch[i]);
            if(i==ch.length-1 && loopcheck==1)
            {
                i=0;
            }

        }
        

        return str.toString();
    }
    public static void main(String[] args)
    {
        StringGreat sg=new StringGreat();
        String s="abBAcC";
        System.out.println(sg.makeGood(s));
    }
}
