class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3){
            return 0;
        }
        int count = 0;
        for(int n = 0; n < grid.length - 2; n++){
            for(int m = 0; m < grid[n].length -2; m++){
                if(helper(grid, n , m)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean helper(int[][] grid, int i, int j){
        int diagonalSum1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
        int diagonalSum2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];
        int rowSum1 = grid[i][j] + grid[i][j+1] + grid[i][j+2];
        int rowSum2 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
        int rowSum3 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
        int colSum1 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
        int colSum2 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
        int colSum3 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
        if(diagonalSum1 != diagonalSum2 || diagonalSum2 != rowSum1 || rowSum1 != rowSum2 || rowSum2 != rowSum3 || rowSum3 != colSum1 || colSum1 != colSum2 || colSum2 != colSum3){
            return false;
        }
        boolean[] distinctArr = new boolean[9];
        for(int n = i; n < i+3; n++){
            for(int m = j; m < j+3; m++){
                if(grid[n][m] >= 10 || grid[n][m] < 1){
                    return false;
                }
                if(distinctArr[grid[n][m] -1] == true){
                    return false;
                }
                distinctArr[grid[n][m] -1] = true;
            }
        }
        return true;
    }
}