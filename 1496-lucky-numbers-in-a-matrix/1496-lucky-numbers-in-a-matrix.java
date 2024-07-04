class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckynum = new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int minindex=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minindex=j;
                }
            }
            int max=matrix[i][minindex];
            for(int k=0; k<matrix.length; k++){
                if(matrix[k][minindex]>max){
                    max=matrix[k][minindex];
                }
            }
            if(min==max){
                luckynum.add(max);
            }
        }
        return luckynum;
    }
}