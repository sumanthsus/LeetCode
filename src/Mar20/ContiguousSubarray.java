package Mar20;

import java.util.Arrays;
import java.util.HashMap;

public class ContiguousSubarray {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (arr[count + nums.length] >= -1) {
                maxlen = Math.max(maxlen, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }

        }
        return maxlen;/*
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int max=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            count=(nums[i]==0)? count-1:count+1;
            System.out.println(map);
            if(map.containsKey(count))
            {
                max=Math.max(max,i-map.get(count));
            }
            else
            {
                map.put(count,i);
            }
        }
        return max;*/
    }
    public static void main(String[] args)
    {
        ContiguousSubarray cs = new ContiguousSubarray();
        int[] nums= new int[]{0,1,0,1,1,0};
        System.out.println(cs.findMaxLength(nums));
    }
}
