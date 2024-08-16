class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minIdx = -1;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i = 0; i < arrays.size(); i++){
            List<Integer> ls = arrays.get(i);
            int currMax = ls.get(ls.size()-1);
            if(currMax > max1){
                max2 = max1;
                max1 = currMax;
                maxIdx = i;
            }
            else if(currMax > max2){
                max2 = currMax;
            }

            int currMin = ls.get(0);
            if(currMin < min1){
                min2 = min1;
                min1 = currMin;
                minIdx = i;
            }
            else if(currMin < min2){
                min2 = currMin;
            }
        }
        return (minIdx == maxIdx) ? (Math.max(Math.abs(max1 - min2), Math.abs(max2 - min1))) : (Math.abs(max1 - min1));
    }
}