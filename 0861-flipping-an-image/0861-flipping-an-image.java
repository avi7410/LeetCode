class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left=0;
            int right=image.length-1;
            int temp;
            while (left<right){
                temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
                left++;
                right--;
            }
        } 
        invert(image);
        return image;
    }
    
    public int[][] invert(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=1;
                }
            }
        }
        return arr;
    }
}