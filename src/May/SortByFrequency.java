package May;

import java.util.HashMap;

public class SortByFrequency {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[26];
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            hm.put('a',i);
            freq[ch[i]-'a']++;
        }
        StringBuilder str = new StringBuilder();
        return "";
    }
    public static void main(String[] args)
    {
        SortByFrequency fr = new SortByFrequency();
        String s = "leetcode";
        System.out.println(fr.frequencySort(s));
    }
}
