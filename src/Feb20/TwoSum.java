package Feb20;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            System.out.println("diff : " + diff + " nums[i] : " + nums[i]);
            if( hm.containsKey(diff))
            {
                return new int[]{hm.get(diff),i};
            }
            else if(diff>=0)
            {
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();

        int[] nums = new int[]{-1,-2,-3,-4,-5};

        System.out.println(Arrays.toString(ts.twoSum(nums,-8)));

    }
}
