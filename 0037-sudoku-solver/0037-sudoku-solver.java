class Solution {
    public void solveSudoku(char[][] board) {
        int[][] boardNum = boardConverter(board);
        sudokuSolver(boardNum);
        boardToChar(board, boardNum);
    }
    private boolean isSafe(int[][] board, int r, int c, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == num || board[i][c] == num) {
                return false;
            }
        }
        int rowStart = r - r % 3;
        int colStart = c - c % 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean sudokuSolver(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0){
                    for(int num = 1; num <= 9; num++){
                        if(isSafe(board, i, j, num)){
                            board[i][j] = num;
                            if(sudokuSolver(board)){
                                return true;
                            }else{
                                board[i][j] = 0;;
                            }
                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private int[][] boardConverter (char[][]board){
        int[][] result = new int[board.length][board.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.'){
                    result[i][j] = 0;
                }
                else{
                    result[i][j] = board[i][j] - '0';
                }
            }
        }
        return result;
    }
    private void boardToChar(char[][] board, int[][] boardNum) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = (char) (boardNum[i][j] + '0');
            }
        }
    }
}