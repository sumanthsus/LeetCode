package Mar20;

import java.util.Arrays;

public class OriginalArrayOfXOR {
    public int[] findArray(int[] pref) {
        //int[] res = new int[pref.length];
        //res[0]=pref[0];
        // int nl=0,a=pref[0];
        //for(int i=1;i<pref.length;i++)
        //{

        int start = 1;
        int end = pref.length-2;
        while(start<end)
        {
            System.out.println("pref[" + start + "] : " +pref[start]+" pref[" + end + "] : " + pref[end]);
            pref[start]= pref[start-1] ^ pref[start];
            start++;
            pref[end+1] = pref[end] ^ pref[end+1];
            end--;
        }
        //n = pref[i-1] ^ pref[i];
        //  pref[i]=n;
        //}
        //pref[pref.length-1]=;
        return pref;
    }

    public static void main(String[] args)
    {
        OriginalArrayOfXOR or = new OriginalArrayOfXOR();

        int[] nums = new int[]{5,2,0,3,1};

        int a = 5 ^ 6;
        int b = a ^ 7;
        int c = b ^ 8;
        System.out.println("a : " + a + " b : " + b + " c : " + c);

        System.out.println(Arrays.toString(or.findArray(nums)));
    }
}
