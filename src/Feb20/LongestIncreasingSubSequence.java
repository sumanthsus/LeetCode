package Feb20;

import java.util.Arrays;

public class LongestIncreasingSubSequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int maxlength = 1;

        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                maxlength=Math.max(dp[i],maxlength);
            }
        }

        return maxlength;
    }

    public static void main(String[] args)
    {
        LongestIncreasingSubSequence ls = new LongestIncreasingSubSequence();
        int[] nums = new int[]{1};
        int x = ls.lengthOfLIS(nums);
        System.out.println(x);
    }
}
