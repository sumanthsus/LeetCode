package May;

import java.util.Arrays;
import java.util.List;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int max1=g[g.length-1];
        int max2=s[s.length-1];
        int[] freq1=new int[max1+1];
        int[] freq2=new int[max2+1];

        for (int k : g) {
            freq1[k]++;
        }
        for (int k : s) {
            freq2[k]++;
        }
        int i=0,j=0,count=0;

        while(i<=max1 && j<=max2)
        {
            while(i<=max1 && freq1[i]==0)
            {
                i++;
            }
            while(j<=max2 && freq2[j]==0)
            {
                j++;
            }
            System.out.println("i : "+ i + " j: " + j);
            if(i>max1 || j>max2)
            {
                break;
            }
            if(j<i)
            {
                while(j<i && j<=max2)
                {
                    j++;
                }
            }else{
            count++;
            freq1[i]--;
            freq2[j]--;}
            System.out.println("freq1 : " + Arrays.toString(freq1) +" freq2 : " + Arrays.toString(freq2));

        }

        return count;


        /*int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                i++;
                count++;
                s[j]=0;
            }
            else {
                j++;
            }
        }
        return count;*/
    }
    public static void main(String[] args)
    {
        AssignCookies ac = new AssignCookies();
        int[] g = new int[]{1,2,3};
        int[] c = new int[]{3};
        System.out.println(ac.findContentChildren(g,c));
    }
}
