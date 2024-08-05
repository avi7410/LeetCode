class Solution {
    public int minimumArea(int[][] grid) {
        int top = grid.length; // min of i;
        int left = grid[0].length; // min of j;
        int right = -1; // max of j;
        int bottom = -1; // max of i;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){if(i < top){
                    top = i;
                }
                if(i > bottom){
                    bottom = i;
                }
                if(j < left){
                    left = j;
                }
                if(j > right){
                    right = j;
                }}
            }
        }
        return (bottom - top + 1) * (right - left + 1);
    }
}