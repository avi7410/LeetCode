class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        for(int i = 0; i < height.length-1; i++){
            for(int j = i+1; j < height.length; j++){
                int temp = (j - i) * Math.min(height[i], height[j]);
                maxWater = Math.max(maxWater, temp);
            }
        }
        return maxWater;
    }
}