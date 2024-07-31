class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }
        double max = sum / (double) k;
        for(int i = k; i < nums.length; i++){
            sum+= nums[i];
            sum-= nums[i-k];
            double avg = sum / k;
            if(avg > max){
                max = avg;
            }
        }
        return max;
    }
}