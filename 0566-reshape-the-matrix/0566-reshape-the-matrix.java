class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n){
            return mat;
        }
        List<Integer> temp = new ArrayList<Integer>();
        int[][] ans = new int[r][c];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                temp.add(mat[i][j]);
            }
            
        }
        int pt=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j]=temp.get(pt);
                pt++;
            }
            
        }
        return ans;
    }
}