class Solution {
    public void solveSudoku(char[][] board) {
        solveSudo(board);
    }

    private boolean solveSudo(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c ='1'; c<= '9'; c++){
                        if(isValidBoard(board, i,j, c)){
                            board[i][j] = c;
                            if(solveSudo(board) == true) return true;
                            else board[i][j] = '.';                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidBoard(char[][] board, int row, int col, char c){
        for(int i=0; i<9; i++){
            if(board[i][col] == c) return false;
            if(board[row][i] == c) return false;
            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c) return false;
        }
        return true;
    }
}