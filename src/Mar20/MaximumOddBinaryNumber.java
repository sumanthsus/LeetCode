package Mar20;

import java.util.Arrays;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {

        char[] ch= s.toCharArray();

        char[] res = new char[ch.length];
        //Arrays.fill(res,'0');
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='1')
            {
                count++;
            }
            res[i] = '0';
        }

        for(int i=0;i<count-1;i++)
        {
            res[i]='1';
        }
        res[res.length-1]='1';
        return new String(res);
    }

    public static void main(String[] args)
    {
        MaximumOddBinaryNumber md = new MaximumOddBinaryNumber();

        System.out.println(md.maximumOddBinaryNumber("01001"));
    }
}
