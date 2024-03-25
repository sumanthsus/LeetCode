package April;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] count=new int[nums.length+1];
        Arrays.fill(count,0);
        for(int n:nums)
        {
            count[n]++;
        }

        for(int i=0;i<count.length;i++)
        {
            if(count[i]==2)
            {
                res.add(i);
            }
        }
        return res;

        /*HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int val = Math.abs(nums[i]);
            System.out.println(Arrays.toString(nums));
            if(nums[val-1]<0)
            {
                res.add(val);
            }
            else{
                nums[val-1]*=-1;
            }
            System.out.println(res);
        }
        return res;

        /*
        for(int n:nums)
        {
            if(hm.get(n)!=null)
            {
                res.add(n);
            }
            hm.put(n,0);
        }

        return res;*/
    }
    public static void main(String[] args)
    {
        FindAllDuplicates fd = new FindAllDuplicates();
        int[] nums = new int[]{10,2,5,10,9,1,1,4,3,7};
        System.out.println(fd.findDuplicates(nums));
    }

}
