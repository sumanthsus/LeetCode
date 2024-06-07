package June;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        HashSet<Character> str = new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            char[] ch = words[i].toCharArray();
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<ch.length;j++)
            {
                if(i==0) {
                    hs.add(ch[j]);
                    continue;
                }
                //System.out.println("ch[" + j + "] : " + ch[j] + " str : " + str + " hs : " + hs  + " unda : " + str.contains(ch[j]));
                if(str.contains(ch[j]))
                {
                    hs.add(ch[j]);
                }
            }
            str = new HashSet<>(hs);
            //System.out.println(str);
            if(str.isEmpty())
            {
                return new ArrayList<>();
            }
        }
        List<String> result = new ArrayList<>();
        for (char ch : str) {
            result.add(String.valueOf(ch));
        }

        return result;
    }
    public static void main(String[] args)
    {
        FindCommonCharacters fc = new FindCommonCharacters();
        String[] words = new String[]{"cool","lock","cook"};
        System.out.println(fc.commonChars(words));

    }
}
