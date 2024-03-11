package Mar20;

import java.util.Arrays;

public class SaradaTwoSum {

    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
        {
            int y = target - nums[i];
            System.out.println(y);
        }
        return nums;
    }

    public static void main(String[] args)
    {
        SaradaTwoSum sts = new SaradaTwoSum();
        int[] nums = new int[]{3,2,4};

        System.out.println(Arrays.toString(sts.twoSum(nums,6)));
    }
}
