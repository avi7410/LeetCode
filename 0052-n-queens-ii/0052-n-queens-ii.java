class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return Nqueens(board, 0, n);
    }
    private int Nqueens(boolean[][] board, int row, int n){
        if(n == 0){
            return 1;
        }
        if(row == board.length) return 0;
        int count = 0;
        for(int i = 0; i < board[row].length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                count += Nqueens(board, row + 1, n - 1);
                board[row][i] = false;
            }
        }
        return count;
    }
    private boolean isSafe(boolean[][] board, int row, int col){
        //vertical check
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }
        //left diagonal
        int leftDia = Math.min(col, row);
        for(int i = 1; i <= leftDia; i++){
            if(board[row - i][col - i]) return false;
        }
        //right diagonal
        int rightDia = Math.min(row, board[0].length - col - 1);
        for(int i = 1; i <= rightDia; i++){
            if(board[row - i][col + i]) return false;
        }
        return true;
    }
}