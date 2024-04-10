package April;

public class WordSearch {
    public boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
            {
                System.out.println(board[i][j] + " i : " + i + " j : " + j );
                if(board[i][j]==word.charAt(0))
                    return recur(board,word,0,i,j,999999999,99999999);
            }
        return true;
    }

    public boolean recur(char[][] board,String word,int wordpos,int x,int y,int lx,int ly)
    {
        if(wordpos == word.length())
        {
            return true;
        }
        if(word.charAt(wordpos)!=board[x][y])
        {
            return false;
        }
        System.out.println(board[x][y] + " ");
        if(x+1<board.length)
            if((board[x+1][y] == word.charAt(wordpos+1)) && ((x+1)!=lx && y!=ly))
                return recur(board, word, wordpos + 1, x+1, y, x, y);

        if(x-1>0)
            if((board[x-1][y] == word.charAt(wordpos+1)) && ((x-1)!=lx && y!=ly))
                return recur(board, word, wordpos + 1, x-1, y, x, y);

        if(y+1<board[0].length)
            if((board[x][y+1] == word.charAt(wordpos+1)) && ((x)!=lx && (y+1)!=ly))
                return recur(board, word, wordpos + 1, x, y + 1, x, y);

        if(y-1>0)
            if((board[x][y-1] == word.charAt(wordpos+1)) && ((x+1)!=lx && (y-1)!=ly))
                return recur(board, word, wordpos + 1, x, y - 1, x, y);


        return false;
    }

    public static void main(String[] args)
    {
        WordSearch ws = new WordSearch();
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(ws.exist(board,"ESCFDE"));
    }
}
