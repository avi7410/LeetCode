class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix.length*matrix[0].length-1;
        int m=matrix[0].length;
        while(s<=e){
            int mid= s+(e-s)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}