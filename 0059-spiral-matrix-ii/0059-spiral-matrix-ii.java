class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int [n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int counter=1;
        int i=0;
        while(left<=right && top<=bottom){
            for(i=left ; i<=right; i++){
                ans[top][i]=counter;
                counter++;
            }
            top++;
            for(i=top ; i<=bottom; i++){
                ans[i][right]=counter;
                counter++;
            }
            right--;
            if(left>right || top>bottom){
                break;
            }
            for(i=right; i>=left; i--){
                ans[bottom][i]=counter;
                counter++;
            }
            bottom--;
            for(i=bottom; i>=top; i--){
                ans[i][left]=counter;
                counter++;
            }
            left++;
        }
        return ans;
    }
}