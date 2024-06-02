package May;

import java.util.Arrays;

public class XgreaterthanX {
    public int specialArray(int[] nums) {
        int x = nums.length;
        System.out.println(Arrays.toString(nums));
        int[] counts = new int[x+1];

        for(int elem : nums) {
            if (elem >= x)
                counts[x]++;
            else
                counts[elem]++;
            System.out.println(Arrays.toString(counts));
        }


        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                return i;
        }

        return -1;
        /* Arrays.sort(nums);
        int res=1;
        //System.out.println(Arrays.toString(nums));
        for(res=1;res<=nums.length;res++)
        {
            int i=0;
            while(i<nums.length && res>nums[i])
            {
                i++;
                //System.out.println("res : " + res + " i : " + i);
            }
            //System.out.println("res : " + res + " rem : " + (nums.length-i) + " i : " + i);
            if(nums.length-i==res)
            {
                return res;
            }
        }
        return -1;*/
    }
    public static void main(String[] args)
    {
        XgreaterthanX  gt = new XgreaterthanX();
        int[] nums= new int[]{3,2,5,1,9,4,10};
        System.out.println(gt.specialArray(nums));
    }
}
