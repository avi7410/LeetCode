class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> temp = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        if(r*c != mat[0].length * mat.length){
            return mat;
        }
        for(int i = 0; i < mat.length * mat[0].length; i++){
            row = i / mat[0].length;
            col = i % mat[0].length;
            temp.add(mat[row][col]);
        }
        int[][] ans = new int[r][c];
        for(int i = 0; i < r * c; i++){
            row = i / c;
            col = i % c;
            ans[row][col] = temp.get(i);
        }
        return ans;
    }
}