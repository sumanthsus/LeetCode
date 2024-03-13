package Mar20;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        Set<Character> unnai = new HashSet<>();
        int max=0;
        while(j<s.length())
        {
            if(!unnai.contains(s.charAt(j)))
            {
                unnai.add(s.charAt(j));
                max=Math.max(max,unnai.size());
                j++;
            }
            else
            {
                unnai.remove(s.charAt(i));
                i++;
            }
        }
        return max;

        /*Set<Character> unnai = new HashSet<>();
        char[] str = s.toCharArray();
        s.charAt()
        int max = 0;
        int siz = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str.length; j++) {

                System.out.println("str["+i+"] : " + str[i] +" str["+j+"] : "+str[j]+ " unnai : " + unnai + " max : " + max + " siz : " + siz );

                if (!unnai.contains(str[j])) {
                    unnai.add(str[j]);
                    siz += 1;
                } else {
                    unnai.clear();
                    unnai.add(str[i]);
                    siz = 1;
                    break;
                }
                if (siz > max) max = siz;

            }

        }return max;*/
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating sb = new LongestSubstringWithoutRepeating();
        System.out.println(sb.lengthOfLongestSubstring("pwwkew"));
    }
}
