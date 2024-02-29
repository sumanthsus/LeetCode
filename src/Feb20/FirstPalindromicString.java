package Feb20;

public class FirstPalindromicString {

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
        /*for(String word : words)
        {
            char[] ch = word.toCharArray();

            for(int i=0,j=ch.length-1;i<=j;i++,j--)
            {
                System.out.println("ch["+ i +"] : " + ch[i] + " ch[" + j + "] : " +ch[j]+" word : " + word + " count : " + count);
                if(ch[i] != ch[j])
                {
                    count=1;
                    break;
                }
                else
                {
                    count=2;

                }
            }
            if(count!=1)
            {
                return word;
            }

        }
        return "";*/
    }
    public boolean isPalindrome(String str){
        if(str== null || str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        FirstPalindromicString fp = new FirstPalindromicString();
        String[] words = new String[]{"abc","car","ada","racecar","cool"};
        System.out.println(fp.firstPalindrome(words));
    }
}
