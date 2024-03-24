package April;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];

        do {
            slow = nums[slow];
            int sas = nums[fast];
            fast = nums[nums[fast]];
            System.out.println("Slow : " + slow + " Fast : " + fast + " first fast : " + sas);
        }while(slow!=fast);
        System.out.println("Ippativaraku result :"+slow +" Second Loop");
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
            System.out.println("Slow : " + slow + " Fast : " + fast );
        }

        return slow;

        /*
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])!=null)
            {
                return nums[i];
            }
            hm.put(nums[i],i);
        }

        return -1;*/

    }
    public static void main(String[] args)
    {
        FindTheDuplicateNumber dp = new FindTheDuplicateNumber();
        int[] nums = new int[]{2,5,9,6,9,3,8,9,7,1};
        int[] numb = new int[]{4,2,1,3,6,5,4,7,8,9};
        System.out.println(Arrays.toString(numb));
        //System.out.println(Arrays.toString(nums));
        System.out.println(dp.findDuplicate(numb));
    }
}
