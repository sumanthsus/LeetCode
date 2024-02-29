package Feb20;

public class PartitionMaxSum {

    public int maxSumAfterPartitioning(int[] arr, int k) {

        return MaxSumRecur(0,arr,k);

    }

    public int MaxSumRecur(int ind, int[] arr, int k)
    {
        if(ind == arr.length) return 0;
        int len=0,localmax=0,sum=0,maxsum=0;
        for(int j=ind;j<Math.min(ind+k,arr.length);j++)
        {
            len++;

            localmax= Math.max(localmax,arr[j]);

            sum = len*localmax + MaxSumRecur(j+1,arr,k);

            maxsum = Math.max(maxsum,sum);
        }

        return maxsum;
    }


    public static void main(String[] args)
    {
        PartitionMaxSum pm = new PartitionMaxSum();

        int[] a = new int[]{1,15,7,9,2,1,10};

        System.out.println(pm.maxSumAfterPartitioning(a,3));
    }
}
