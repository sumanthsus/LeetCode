package Feb20;

import java.util.Arrays;

public class RearrangeArray {

    public int[] rearrangeArray(int[] nums) {
        int pos = 0,neg=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                res[pos]=nums[i];
                pos+=2;
            }
            else
            {
                res[neg]=nums[i];
                neg+=2;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        RearrangeArray rr = new RearrangeArray();
        int[] nums = new int[]{3,1,-3,4,-2,-5};
        System.out.println(Arrays.toString(rr.rearrangeArray(nums)));
    }
}
