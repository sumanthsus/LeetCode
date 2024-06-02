package April;

public class MaxSplitString {
    public int maxScore(String s) {
        char[] spl = s.toCharArray();
        int n=spl.length;
        int one =0,score=0;
        for(char c:spl)
        {
            if(c=='1') one++;
        }
        int left=0,right=one;

        for(int i=0;i<n-1;i++) {

            if (spl[i] == '0') {
                left = left + 1;
            } else {
                right = right - 1;
            }
            //System.out.println(left+ " " + right + " " + i + " score : " + score);
            if(left+right > score) score=left+right;

        }
        return score;
    }
    public static void main(String[] args)
    {
        MaxSplitString ms = new MaxSplitString();
        String s = "10110011";
        System.out.println(ms.maxScore(s));
    }
}
