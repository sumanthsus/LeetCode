package April;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int tempp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=tempp;
            }
            /*int x=0,y=n-1;

            while(x<=y)
            {
                int tempp=matrix[i][x];
                matrix[i][x]=matrix[i][y];
                matrix[i][y]=tempp;
                x++;y--;
            }*/
        }

/* Another Solution
        int[][] res= new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            int x= matrix.length-1;
            for(int j=0;j<matrix[0].length;j++)
            {
                res[i][x]=matrix[j][i];
                //System.out.println("res["+i+"]["+x+"] : " + res[i][x]);
                x--;
            }

        }

        for(int i=0;i<matrix.length;i++)
            for(int j =0;j<matrix.length;j++)
                matrix[i][j]=res[i][j];*/


    }
    public void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args)
    {
        RotateImage ri = new RotateImage();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        ri.rotate(matrix);
        System.out.println("matrix:");
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
