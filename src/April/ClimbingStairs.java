package April;

public class ClimbingStairs {
    public int climbStairs(int n) {
        return climbrecur(0,n);

    }
    public int climbrecur(int sum, int n )
    {
        if (sum > n) {
            return 0; // Base case: Invalid path, return 0.
        }
        if (sum == n) {
            return 1; // Base case: Reached the top, return 1.
        }


        // Recursive cases: move either 1 or 2 steps.
        int count1 = climbrecur(sum + 1, n);
        int count2 = climbrecur(sum + 2, n);

        return count1 + count2;
        /*if(sum==n && left>0)
        {
            return ++count;
        }
        if(left<0)
        {
            return count;
        }

        int count1=climbrecur(sum + 1, n, count, left - 1);
        int count2=climbrecur(sum + 2, n, count, left - 1);
        System.out.println(count);
        return count1+count2;*/
    }
    public static void main(String[] args)
    {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(4));
    }
}
