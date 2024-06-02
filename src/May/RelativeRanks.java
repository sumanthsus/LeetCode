package May;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    static void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }


    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        for(int i=0;i<str.length;i++)
        {
            str[i] = String.valueOf(score[i]);
        }
        Arrays.sort(score);
        HashMap<Integer,String> ranks = new HashMap<>();
        int rank =1;
        for(int i=score.length-1;i>=0;i--)
        {
            if(rank == 1) {
                ranks.put(score[i],"Golden Medal");
            }
            else if(rank == 2) {
                ranks.put(score[i],"Silver Medal");
            }
            else if(rank == 3) {
                ranks.put(score[i],"Bronze Medal");
            }
            else{
                ranks.put(score[i], String.valueOf(rank));
            }
            rank++;
        }

        for(int i=0;i<str.length;i++)
        {
            str[i] = ranks.get(Integer.valueOf(str[i]));
        }

        return str;
    }
    public static void main(String[] args)
    {
        RelativeRanks rr = new RelativeRanks();

        int[] a = new int[]{10,7,2,5,8,6,13,90};

        System.out.println(Arrays.toString(rr.findRelativeRanks(a)));
        /*    int mid = (a.length/2)-1;

        for(int i=mid;i>=0;i--)
        {
            heapify(a,a.length,i);
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }*/

    }

}
