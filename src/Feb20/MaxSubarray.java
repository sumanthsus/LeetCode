package Feb20;

public class MaxSubarray {

    public int maxSubArray(int[] nums) {
        int currentsum=Integer.MIN_VALUE,maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(" Currentsum : " + currentsum + " maxsum : " + maxsum + " nums [ " + i+ " ] :" + nums[i]);
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
        /*for(int n :nums)
        {
            if(currentsum<0)
                currentsum=0;

            currentsum+=n;

            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;*/

        /*int i=0;
        int j=1;
        currentsum=nums[i];
        while(i<j && j<=nums.length-1)
        {
            //System.out.println("CurrentSum : " + currentsum);
            currentsum= currentsum+nums[j];
            System.out.println(" nums["+i+"] : "+ nums[i] + " nums["+j+"] : "+ nums[j] +" cursum : " + currentsum +  " maxsum : " + maxsum);
            if(currentsum<0)
            {
                i=i+1;
                j=j+1;
                currentsum=nums[i];
            }
            else if(maxsum<currentsum)
            {
                maxsum=currentsum;
                j+=1;
            }
        }

        return maxsum;*/
    }


    public static void main(String[] args)
    {
        MaxSubarray ms = new MaxSubarray();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(nums));
    }
}
