package April;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int peri=0;
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0) continue;

                if(i-1<0) peri+=1;
                else {
                    if(grid[i-1][j]==0)
                    {
                        peri+=1;
                    }
                }
                if(i+1>=n) peri+=1;
                else {
                    if(grid[i+1][j]==0)
                    {
                        peri+=1;
                    }
                }
                if(j-1<0) peri+=1;
                else {
                    if(grid[i][j-1]==0)
                    {
                        peri+=1;
                    }
                }
                if(j+1>=m) peri+=1;
                else {
                    if(grid[i][j+1]==0)
                    {
                        peri+=1;
                    }
                }

            }
        }
        return peri;
    }

    public static void main(String[] args)
    {
        IslandPerimeter isp = new IslandPerimeter();
        int[][] matrix = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(isp.islandPerimeter(matrix));
    }
}
