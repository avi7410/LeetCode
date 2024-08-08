class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;
        while(i < j && i < height.length && j >= 0){
            int temp =  Math.min(height[i], height[j]);
            maxWater = Math.max(maxWater, temp * (j - i));
            while(i < j && height[i] <= temp && i < height.length){
                i++;
            }
            while(i < j && height[j] <= temp && j >= 0){
                j--;
            }
        }
        return maxWater;
    }
}