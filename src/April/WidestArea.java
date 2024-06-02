package April;

import java.util.Arrays;

public class WidestArea {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr= new int[points.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int dis = Math.abs(arr[i]-arr[i+1]);
            if(dis>max) max=dis;
        }
        return max;
    }
    public static void main(String[] args)
    {
        WidestArea wa = new WidestArea();
        int[][] points = new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(wa.maxWidthOfVerticalArea(points));
    }
}
