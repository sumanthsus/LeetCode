package April;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int finalres=0,check=0;
        for(int i=0;i<nums.length;i++)
        {
            int crctidx=nums[i]-1;
            if(crctidx==-1)
            {
                check=1;
                finalres=i;
                System.out.println("i : " + i + " nums : "+nums[i]);
                continue;
            }
            while(nums[i]!=nums[crctidx])
            {
                int temp = nums[i];
                nums[i]=nums[crctidx];
                nums[crctidx]=temp;
                crctidx=nums[i]-1;
                //System.out.println("--" + nums[i] + " " +nums[crctidx]);
                if(crctidx==-1) {
                    check=1;
                    finalres=i;
                    System.out.println("i : " + i + " nums : "+nums[i]);
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
        if(check==0) return 0;
        return finalres+1;
    }
    public static void main(String[] args)
    {
        MissingNumber mn = new MissingNumber();
        int[] nums= new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(mn.missingNumber(nums));
    }
}
