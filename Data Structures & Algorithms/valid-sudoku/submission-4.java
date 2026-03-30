class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] col = new boolean[9][9];
         boolean[][] row = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
               int boar = board[i][j]-'1';
            if(row[i][boar]) return false;

            row[i][boar] = true;

            if(col[j][boar]) return false;
               col[j][boar]= true;

               if(boxes[(i/3)*3 + (j/3)][boar]) return false;
               boxes[(i/3)*3 + (j/3)][boar] = true;
            }
        }

        return true;
    }
}
