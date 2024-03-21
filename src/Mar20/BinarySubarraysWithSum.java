package Mar20;

public class BinarySubarraysWithSum {
    public int solve(int []nums, int k){
        if(k<0){
            return 0;
        }
        int j=0;
        int i=0;
        int sum=0;
        int ans=0;
        while(i<nums.length){
            sum+=nums[i];
            while(sum>k&&j<nums.length){
                sum-=nums[j];
                j++;
            }
            if(sum<=k){
                ans+=i-j+1;
            }
            i++;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int x=solve(nums,goal);
        int y=solve(nums,goal-1);
        return x-y;
    }
    /*public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length,max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                if(sum==goal)
                {
                    max++;
                }
            }

            sum=0;
        }
        return max;
    }*/
    public static void main(String[] args)
    {
        BinarySubarraysWithSum bs = new BinarySubarraysWithSum();
        int[] nums= new int[]{1,0,1,0,1};
        int goal=2;
        System.out.println(bs.numSubarraysWithSum(nums,goal));
    }
}
