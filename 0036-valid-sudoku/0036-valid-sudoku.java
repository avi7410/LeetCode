class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean flag = true;
        for(int i = 0; i < board.length; i++){
            flag = checkRow(board, i);
            if(!flag) return false;
            flag = checkCol(board, i);
            if(!flag) return false;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                flag = checkSubBox(board, i, j);
                if(!flag) return false;
            }
        }
        return true;
    }
    private boolean checkRow(char[][] board, int col){
        int[] arr = new int[10];
        for(int i = 0; i < board.length; i++){
            char ch = board[i][col];
            if(ch == '.') continue;
            int idx = ch - '0';
            if(arr[idx] == 1) return false;
            arr[idx]++;
        }
        return true;
    }
    private boolean checkCol(char[][] board, int row){
        int[] arr = new int[10];
        for(int i = 0; i < board.length; i++){
            char ch = board[row][i];
            if(ch == '.') continue;
            int idx = ch - '0';
            if(arr[idx] == 1) return false;
            arr[idx]++;
        }
        return true;
    }
    private boolean checkSubBox(char[][] board, int row, int col){
        int rStart = row * 3;
        int cStart = col * 3;
        int[] arr = new int[10];
        for(int i = rStart; i < rStart + 3; i++){
            for(int j = cStart; j < cStart + 3; j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                int idx = ch - '0';
                if(arr[idx] == 1) return false;
                arr[idx]++;
            }
        }
        return true;
    }
}