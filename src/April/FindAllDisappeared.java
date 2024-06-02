package April;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int crctidx = nums[i]-1;
            while(nums[i]!=nums[crctidx])
            {
                int temp = nums[i];
                nums[i]=nums[crctidx];
                nums[crctidx]=temp;
                crctidx = nums[i]-1;
            }
            System.out.println(Arrays.toString(nums));
        }
        for(int i=0;i<n;i++)
        {
            if(i+1 != nums[i])
            {
                arr.add(i+1);
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        FindAllDisappeared fad = new FindAllDisappeared();
        int[] nums= new int[]{4,3,2,7,8,2,3,1};
        System.out.println(fad.findDisappearedNumbers(nums).toString());
    }
}
