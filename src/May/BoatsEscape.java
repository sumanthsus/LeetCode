package May;

import java.util.Arrays;

public class BoatsEscape {
    public int numRescueBoats(int[] people, int limit) {
        int i=0,j=people.length-1,boats=0;
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        while(i<=j)
        {

            if(people[j] + people[i]>limit)
            {
                boats++;
                j--;
            }
            else if (people[j] + people[i]<=limit)
            {
                boats++;
                i++;
                j--;
            }
        }
        return boats;
    }


    public static void main(String[] args)
    {
        BoatsEscape BT = new BoatsEscape();
        int[] nums = new int[]{3,5,3,4};
        int limit=5;
        System.out.println(BT.numRescueBoats(nums,limit));
    }

}
