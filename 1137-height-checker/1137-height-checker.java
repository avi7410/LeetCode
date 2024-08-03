class Solution {
    public int heightChecker(int[] heights) {
        int[] original = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(original[i] != heights[i]){
                count += 1;
            }
        }
        return count;
    }
}