package Mar20;


import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {

        int x=0,y=0;
        while(x<nums1.length && y<nums2.length){

            if(nums1[x]==nums2[y])
            {
                return nums1[x];
            }
            else if(nums1[x]>nums2[y])
            {
                y++;
            }
            else {

                x++;
            }
        }
        return -1;


        /*if(nums1.length>nums2.length)
            return Check(nums2,nums1);
        else
            return Check(nums1,nums2);


        /*Set<Integer> sathi = new HashSet<>();
        int size = sathi.size();
        int l = Math.max(nums1.length,nums2.length);
        int r = Math.min(nums1.length,nums2.length);
        for(int i=0;i<l;i++)
        {
            sathi.add(nums1[i]);
            size+=1;
            if(sathi.size()!=size)
            {
                return nums1[i];
            }
            sathi.add(nums2[i]);
            size+=1;
            if(sathi.size()!=size)
            {
                return nums2[i];
            }
            if(i==r-1)
            {
                return -1;
            }
        }
        return -1;

        /*for(int i=0;i<nums1.length;i++)
=======
public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {

        for(int i=0;i<nums1.length;i++)
>>>>>>> origin/master
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                    return nums1[i];
            }
        }*/
    }
    /*public int Check(int[] nums1,int[] nums2)
    {

        for(int i=0;i<nums1.length;i++)
        {
            int x=0;
            int y=nums2.length;
            while(x<y) {
                int mid = x + y / 2;
                System.out.println("nums1 : " + nums1[i] + " nums2[" + mid + "] :" + nums2[mid] + " x : " + x + " y : " + y);

                if (nums2[mid] > nums1[i]) {
                    y = mid;
                } else if (nums2[mid] < nums1[i]) {
                    x = mid;
                } else {
                    return nums1[i];
                }
            }
        }
        return -1;
    }*/
    public static void main(String[] args)
    {
        MinimumCommonValue mc = new MinimumCommonValue();
        int[] nums1 = new int[]{1,2,3,6};
        int[] num2 = new int[]{2,3,4,5};
        System.out.println(mc.getCommon(nums1,num2));


    }
}
