class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int left,right,temp;
        for(int i=0;i<image.length;i++){
            left=0;
            right=image.length-1;
            while(right>=left){
                if(left==right){
                    image[i][left]=1-image[i][left];
                    break;
                }
                temp=image[i][left];
                image[i][left]=1-image[i][right];
                image[i][right]=1-temp;
                left++;
                right--;
            }
        }
        return image;
    }
}