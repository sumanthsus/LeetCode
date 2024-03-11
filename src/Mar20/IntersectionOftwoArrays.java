package Mar20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class IntersectionOftwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> load = new HashSet<>();
        Set<Integer> shoot = new HashSet<>();

        for(int num : nums1)
        {
            load.add(num);
        }

        for(int num : nums2)
        {
            if(load.contains(num))
                shoot.add(num);
        }
        int[] res = new int[shoot.size()];
        int i=0;
        for(int num:shoot)
        {
            res[i++]=num;
        }
        return res;
    }

    public static void main(String[] args)
    {
        IntersectionOftwoArrays it = new IntersectionOftwoArrays();
        int[] nums1 = new int[]{1,2,3,4,2,1,4};
        int[] nums2 = new int[]{2,2,3,3};
        System.out.println(Arrays.toString(it.intersection(nums1, nums2)));
    }
}
