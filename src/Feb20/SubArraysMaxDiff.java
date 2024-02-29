package Feb20;

import java.util.Arrays;

public class SubArraysMaxDiff {

    public int[][] divideArray(int[] nums, int k) {
        int[][] res = new int[nums.length/3][3];
        int x=0,y=0;
        Arrays.sort(nums);
        System.out.println("Sorted Array : " + Arrays.toString(nums));

        for(int i=0;i<nums.length;i++)
        {
            //System.out.println();
            res[x][y] = nums[i];
            System.out.println("res["+x+"]["+y+"] : " + res[x][y] + " nums["+i+"] : "+nums[i]);
            y++;
            if(y%3 == 0) {
                y = 0;
                x++;
            }
        }

        for(int i=0;i<x;i++)
        {
            if(res[i][1]-res[i][0] >k || res[i][2]-res[i][1] >k|| res[i][2]-res[i][0] >k)
            {
                return new int[][]{};
            }

        }


        return res ;
    }

    public static void main(String[] args)
    {
        SubArraysMaxDiff sb = new SubArraysMaxDiff();

        int[] a = new int[] {1,3,3,2,7,3};
        int k = 3;

        System.out.println(Arrays.deepToString(sb.divideArray(a, k)));

    }
}
