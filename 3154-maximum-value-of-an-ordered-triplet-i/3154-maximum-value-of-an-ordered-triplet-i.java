class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = nums[0];
        long maxdiff = 0;
        long ans = 0;
        for(int i = 1; i < nums.length; i++){
            ans = Math.max(ans, maxdiff * nums[i]);
            maxdiff = Math.max(maxdiff, (max - nums[i]));
            max = Math.max(max, nums[i]);
        }
        return ans;
    }
}