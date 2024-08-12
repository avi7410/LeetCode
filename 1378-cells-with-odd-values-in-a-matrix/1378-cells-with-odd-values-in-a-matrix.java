class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            int x = indices[i][0];
            int y = indices[i][1];
            helper(ans, x, y);
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j : ans[i]){
                if(j % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
    private void helper(int[][] arr, int r, int c){
        for(int i = 0; i < arr[0].length; i++){
            arr[r][i] += 1;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i][c] += 1;
        }
    }
}