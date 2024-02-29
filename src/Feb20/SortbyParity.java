package Feb20;

import java.util.Arrays;

public class SortbyParity {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int odd = 0, even = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[odd] = nums[i];
                odd += 2;
            } else {
                res[even] = nums[i];
                even += 2;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        SortbyParity rrr= new SortbyParity();
        int[] nums = new int[]{4,5,2,7};
        System.out.println(Arrays.toString(rrr.sortArrayByParityII(nums)));
    }
}
