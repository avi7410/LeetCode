class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr= new int[r][c];
        int col=0;
        int row=0;
        if(r*c!=mat.length*mat[0].length){
            return mat;
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                arr[row][col]=mat[i][j];
                if(col<c-1){
                    col++;
                }
                else if(row<r-1){
                    row++;
                    col=0;
                }
            }
        }
        return arr;
    }
}