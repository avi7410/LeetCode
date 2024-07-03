class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        
        for(int i=0;i<indices.length;i++){
            int j=0;
                for(int k=0;k<n;k++){
                    arr[indices[i][j]][k]++;
                }
                j++;
                for(int l=0;l<m;l++){
                    arr[l][indices[i][j]]++;
                }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}