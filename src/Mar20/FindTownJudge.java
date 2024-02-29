package Mar20;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Objects;

public class FindTownJudge {

    public int findJudge(int n, int[][] trust) {
       int[] dp = new int[n];
        int max=0;
        System.out.println(Arrays.toString(dp));
       for( int i=0;i<trust.length;i++)
       {
           System.out.println(" i : " + i + " Trust.length : " + trust.length + " trust[i] : " + trust[i][1]);
           dp[trust[i][0]-1]--;
           dp[trust[i][1]-1]++;
           if(dp[max]<dp[trust[i][1]-1])
           {
               max=trust[i][1]-1;
           }
       }

       System.out.println(Arrays.toString(dp) + " max : " + max + " " + dp[max]);
        if(dp[max]==n-1)
            return max+1;

       /*for(int i=0;i<n;i++)
       {
           if (dp[i] == n-1)
           {
               return i+1;
           }
       }*/



        return -1;

        /* int total  = n*(n+1) /2;
        int sum=0;
        Hashtable<Integer,Integer> hm = new Hashtable<>();
        for(int i=0;i<trust.length;i++)
        {
            sum=sum+trust[i][0];
            hm.put(trust[i][0], trust[i][1] );
        }

        //System.out.println("total : " + total + " sum : " + sum + " hm : " + hm.get(3));

        if(total - sum ==0) {

            return -1;
        }
        else if (hm.get(total - sum) == null)
        {
            int start=0;
            int end = n-2;
            int target = total -sum;
            while(start<end)
            {
                if(trust[start][1]!=target || trust[end][1] !=target)
                {
                    return -1;
                }
                start++;
                end--;
            }

            return target;

        }

        return -1;*/


    }

    public static void main(String[] args) {
        FindTownJudge fd = new FindTownJudge();

        int[][] trust = {{1,3},{2,3}};

        System.out.println(fd.findJudge(3,trust));
    }
}
