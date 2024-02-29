package Feb20;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        for(int i =0 ;i<nums.length;i++)
        {
            if(i>0)
                if(nums[i]==nums[i-1])
                    continue;
            System.out.println(" nums["+i+"] : " + nums[i] + " arr : " + arr);
            int x=i+1,y=nums.length-1;
            while (x < y) {
                int sum = nums[i] + nums[x] + nums[y];
                if (sum == 0) {
                    arr.add(Arrays.asList(nums[i], nums[x], nums[y]));
                    x++;
                    y--;
                    // Skip duplicates of x
                    while (x < y && nums[x] == nums[x - 1])
                        x++;
                    // Skip duplicates of y
                    while (x < y && nums[y] == nums[y + 1])
                        y--;
                } else if (sum < 0)
                    x++;
                else
                    y--;
            }

            /*while(x<y)
            {
                System.out.println("x : " + x + " y : " + y );
                int value = nums[x] + nums[y];

                if (value>-1*nums[i]) {
                    y--;
                }
                else if(value< -1*nums[i])
                {
                    x++;
                }
                else{
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[x]);
                    newList.add(nums[y]);
                    newList.add(nums[i]);
                    arr.add(newList);
                    x++;
                }
            }*/
        }

        return arr;
    }

    public static void main(String[] args)
    {
        ThreeSum th = new ThreeSum();

        System.out.println(th.threeSum(new int[]{0,0,0,0}).toString());
    }
}
