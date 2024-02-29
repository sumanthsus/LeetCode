package Mar20;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1)/2);
        int i=0,j=n-1;
        int sum=0;
        while(i<=j)
        {
            System.out.println(" nums[" + i + "] : " + nums[i] + " nums[" + j + "] : " + nums[j]);
            if(i==j)
            {
                sum+=nums[i];
            }
            else
                sum+=nums[i]+nums[j];
            i++;
            j--;
            System.out.println("Sum : " + sum);
        }
        System.out.println(sum +" "+total);
        return total - sum;

        /*if(nums.length==1)
        {
            if(nums[0]==0) return 1;

            return 0;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i=1,j=nums.length-1;
        int n=1,nl=nums.length;
        while(i<nums.length) {
            if(nums[0]==0) {
                if (nums[i] == n) {
                    System.out.println("nums[" + i + "] : " + nums[i] + " " + n);
                    i++;
                    n++;
                } else {
                    System.out.println("nums[" + i + "] : " + nums[i] + " " + n);
                    return n;
                }
                if (nums[j] == nl) {
                    System.out.println(" " + "nums[" + j + "] : " + nums[j] + " " + nl);
                    j--;
                    nl--;
                } else {
                    System.out.println("nums[" + j + "] : " + nums[j] + " " + nl);
                    return nl;
                }
            }
        }
        return 0;*/
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{1,0};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
