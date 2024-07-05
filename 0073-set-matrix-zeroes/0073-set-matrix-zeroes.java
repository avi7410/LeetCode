class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    temp.add(i);
                    temp.add(j);
                }
            }
        }
        for(int i=0; i<temp.size(); i+=2){
            for(int j=0; j<matrix.length; j++){
                matrix[j][temp.get(i+1)]=0;
            }
            for(int k=0; k<matrix[0].length; k++){
                matrix[temp.get(i)][k]=0;
            }
        }
    }
}