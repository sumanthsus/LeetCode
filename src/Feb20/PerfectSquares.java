package Feb20;

import java.util.Arrays;

public class PerfectSquares {

    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for(int target =1;target<=n;target++)
        {
            for(int s =1; s*s<=target;s++)
            {
                int square = s*s;
                System.out.println("target : " + target + " square : " + square + " t-s : " + (target - square));
                dp[target] = Math.min(dp[target],dp[target-square]+1);
                System.out.println(" dp["+target+"] : " + dp[target]);
            }
            System.out.println(Arrays.toString(dp));
        }

        return dp[n];
    }


    public static void main(String[] args)
    {
        PerfectSquares pf = new PerfectSquares();

        System.out.println(pf.numSquares(12));


    }
}
