package Feb20;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) {
            return res;
        }
        Hashtable<Character,String> hm = new Hashtable<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        char[] ch = digits.toCharArray();
        backtrack(res,hm,ch,"",0);
        return res;
    }

    public void backtrack(List<String> res,Hashtable<Character,String> hm,char[] ch1,String currentString,int index)
    {
        if(hm.get(ch1[0])==null)
        {
            return;
        }
        if(currentString.length()==ch1.length)
        {
            res.add(currentString);
            return;
        }
        char[] ch = hm.get(ch1[index]).toCharArray();
        for (char c : ch) {
            backtrack(res, hm, ch1, currentString + c, index + 1);
        }
    }

    public static void main(String[] args)
    {
        LetterCombinationsPhoneNumber lp = new LetterCombinationsPhoneNumber();
        System.out.println(lp.letterCombinations("").toString());
    }
}
