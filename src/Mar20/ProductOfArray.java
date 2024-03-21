package Mar20;

import java.util.Arrays;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int val=1;
        int[] amswer= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {

            amswer[i]=val;
            val*=nums[i];
        }
        val=1;

        for(int i=nums.length-1;i>=0;i--)
        {
            amswer[i]*=val;
            val*=nums[i];
        }

        return amswer;
    }

    public static void main(String[] args)
    {
        ProductOfArray pd = new ProductOfArray();
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(pd.productExceptSelf(nums)));

    }
}
