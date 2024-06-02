package May;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FirstUnique {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[26];

        for(char c : ch)
        {
            freq[c-'a']++;
            //System.out.println(Arrays.toString(freq));
        }
        for(int i=0;i<ch.length;i++)
        {
            if(freq[ch[i]-'a'] == 1 )
            {
                return i;
            }
        }

        return -1;
        /*HashMap<Character,Integer> str = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            if(str.containsKey(ch[i]))
            {
                ch[str.get(ch[i])] ='*';
                ch[i]='*';
                continue;
            }
            str.put(ch[i],i);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='*')
            {
                return i;
            }
        }
        return -1;*/
    }
    public static void main(String[] args)
    {
        FirstUnique fu = new FirstUnique();
        String str = "z";
        System.out.println(fu.firstUniqChar(str));
    }
}
