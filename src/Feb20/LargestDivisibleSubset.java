package Feb20;

import java.util.*;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        /*
        Best
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];
        dp[0] = 1;

        int maxLen = 1, last = 0;

        for (int i = 1; i < n; ++i) {

            for (int j = 0; nums[j] * 2L <= nums[i]; ++j) {

                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }

            ++dp[i];
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                last = i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(maxLen);

        for (int i = last; i >= 0; --i) {
            if (dp[i] == maxLen && nums[last] % nums[i] == 0) {
                ans.add(nums[i]);
                --maxLen;
                last = i;
            }
        }
        return ans;
    }
         */
        List<Integer> dp = new ArrayList<>(Collections.nCopies(nums.length, 1));
        List<Integer> hash = new ArrayList<>(Collections.nCopies(nums.length, 0));
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {

                    if (dp.get(j) + 1 > dp.get(i)) {
                        dp.set(i,dp.get(j)+1);
                        hash.set(i,j);
                    }
                }
            }
            System.out.println(dp + " hash : " + hash + " nums : " + Arrays.toString(nums));
        }

        int max=-1,lastIndex=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(dp.get(i)>max)
            {
                max=dp.get(i);
                lastIndex=i;
            }
        }
        System.out.println("Max : " + max + " Last Index :" + lastIndex);
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[lastIndex]);

        System.out.println(temp);


        while (hash.get(lastIndex) != lastIndex) {
            System.out.println("nums : " + Arrays.toString(nums) + " hash : " + hash + " last Index : " + lastIndex + " " + temp + " ");
            if (hash.get(lastIndex) == 0)
            {
                if(nums[lastIndex]%nums[0]!=0)
                {
                    lastIndex =hash.get(lastIndex);
                    continue;
                }
             }
            lastIndex = hash.get(lastIndex);

            temp.add(nums[lastIndex]);
        }

        return temp;

        /*List<Integer> localres = new ArrayList<>();
        List<Integer> maxarray = new ArrayList<>();
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int maxsize=0;
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0)
                {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    localres.add(nums[j]);
                }
            }
            if(maxsize<localres.size())
            {
                maxarray.clear();
                maxarray=(LinkedList) localres.clone();
                maxsize = localres.size();
            }

        }
        return maxarray;*/
    }

    public static void main(String[] args)
    {
        LargestDivisibleSubset lb = new LargestDivisibleSubset();

        System.out.println(lb.largestDivisibleSubset(new int[]{1,2,4,3,9,12}).toString());
    }
}
