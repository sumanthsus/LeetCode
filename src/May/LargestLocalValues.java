package May;

import java.util.Arrays;

public class LargestLocalValues {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<res.length;i++)
        {
            for(int j =0;j<res[0].length;j++)
            {
                res[i][j]=HighestAround(grid,i+1,j+1);
            }
        }
        return res;
    }
    public int HighestAround(int[][] grid,int i, int j)
    {
        int ni=i+2,nj=j+2,max=0,initj=j-1;
        for(i=i-1;i<ni;i++)
        {
            for(j=initj;j<nj;j++)
            {
                //System.out.print(grid[i][j]+" [" +i+","+j+"]");
                if(max<grid[i][j])
                {
                    //System.out.print("*");
                    max=grid[i][j];
                }
            }
            //System.out.println(" ");
        }
        //System.out.println("______________________________");
        return max;
    }
    public static void main(String[] args)
    {
        LargestLocalValues ll = new LargestLocalValues();
        int[][] matrix = new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        System.out.println(Arrays.deepToString(ll.largestLocal(matrix)));
    }
}
