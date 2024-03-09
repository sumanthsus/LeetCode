package Mar20;

import java.util.Arrays;

public class SquaresofSortedArray {
    public int[] sortedSquares(int[] nums) {

        int i=0;
        int j=nums.length-1;

        while(i<=j)
        {
            nums[i] = nums[i]*nums[i];

            if(i==j){
                i++;j--;
                continue;
            }
            nums[j] = nums[j]*nums[j];
            i++;j--;
        }
        /*for(int i=0;i<nums.length;i++)
        {
            nums[i] = nums[i]*nums[i];
        }*/
        Arrays.sort(nums);

        return nums;
    }
    public static void main(String[] args)
    {
        SquaresofSortedArray ss = new SquaresofSortedArray();

        int[] nums = new int[]{-4,-3,-1,2,8,10,15};

        System.out.println(Arrays.toString(ss.sortedSquares(nums)));
    }
}
