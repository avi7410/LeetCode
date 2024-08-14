class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        boolean[][] board = new boolean[n][n];
        nQueen(board, 0, result);
        return result;
    }
    private void addToList(boolean[][] board, List<List<String>> ans){
        List<String> str = new ArrayList<String>();
        for(int i = 0; i < board.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < board.length; j++){
                if(board[i][j]){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
            str.add(sb.toString());
        }
        ans.add(new ArrayList<>(str));
    }
    private void nQueen(boolean[][] board, int r, List<List<String>> ans){
        if(r == board.length){
            addToList(board,ans);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, r, i)){
                board[r][i] = true;
                nQueen(board, r+1, ans);
                board[r][i] = false;
            }
        }
    }
    private boolean isSafe(boolean[][] board, int r, int c){
        //top side check
        for(int i = r; i >= 0; i--){
            if(board[i][c]){
                return false;
            }
        }
        //left diagonal check
        int leftDiagonal = Math.min(r,c);
        for(int i = 1; i <= leftDiagonal; i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        //right diagonal check
        int rightDiagonal = Math.min(r,board.length - c -1);
        for(int i = 1; i <= rightDiagonal; i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
}