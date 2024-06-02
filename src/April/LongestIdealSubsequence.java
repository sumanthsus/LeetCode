package April;

public class LongestIdealSubsequence {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = 1;  // Every character itself forms a valid ideal string
                for (int p = 0; p < i; p++) {
                    if (Math.abs(s.charAt(i) - s.charAt(p)) <= j) {
                        dp[i][j] = Math.max(dp[i][j], dp[p][j] + 1);
                    }
                }
            }
        }

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }

        return maxLen;
        /*char[] ch = s.toCharArray();
        int localres=1,last=999999,globalres=0;
        for(int j=0;j<ch.length;j++) {
            char chec = ch[j];
            for (int i = j+1; i < ch.length; i++) {
                int num = (int) chec - (int) ch[i];
                if (num < 0) num = num * -1;
                if (num <= k) {
                    System.out.println(j+"  : " + chec + " " + ch[i] + " dis : " + num);
                    localres++;
                    chec = ch[i];
                }
            }
            System.out.println("---------------------" + localres);
            globalres=Math.max(globalres,localres);
            localres=1;

        }
        return globalres;*/
    }
    public static void main(String[] args)
    {
        LongestIdealSubsequence lis = new LongestIdealSubsequence();
        String s = "ca";
        int a = (int)s.toCharArray()[0];
        int b = (int)s.toCharArray()[1];
        System.out.println(b + " " + a + " " + (b-a));
        System.out.println(lis.longestIdealString("eduktdb",15));
    }
}
