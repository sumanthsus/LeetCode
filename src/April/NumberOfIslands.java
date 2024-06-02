package April;

import java.util.Arrays;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j);
                }

            }
            System.out.println(Arrays.deepToString(grid));
        }

        return numIslands;
        /*int rep=2,check=0,number=50,count=0;


        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j]=='0') continue;

                if (i + 1 < grid.length) {
                    if (grid[i + 1][j] == '0' || grid[i + 1][j] == '1') {
                        count++;
                    }
                    else {
                        number=grid[i+1][j]-48;
                    }
                }
                if (i - 1 >= 0) {
                    if (grid[i - 1][j] == '0' || grid[i - 1][j] == '1') {
                        count++;
                    }
                    else {
                        number=grid[i-1][j]-48;
                    }
                }
                if (j + 1 < grid[0].length) {
                    if (grid[i][j + 1] == '0' || grid[i][j + 1] == '1') {
                        count++;
                    }
                    else {
                        number=grid[i][j+1]-48;
                    }
                }
                if (j - 1 >= 0) {
                    if (grid[i][j - 1] == '0' || grid[i][j - 1] == '1') {
                        count++;
                    }
                    else {
                        number=grid[i][j-1]-48;
                    }
                }

                grid[i][j]= (char) number;

                if(count==4)
                {
                    number++;
                }
                System.out.println("Number : " + number);
                count=0;


            }
            System.out.println(Arrays.deepToString(grid));
        }



        return rep-1;*/
    }


    private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] != '1') {
            return;
        }

        grid[row][col] = '0'; // Mark current cell as visited

        // Visit all adjacent cells
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
    public static void main(String[] args){
        NumberOfIslands noi = new NumberOfIslands();

        char[][] ch = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(noi.numIslands(ch));

    }
}
