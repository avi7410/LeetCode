class Solution {
    public long maximumTripletValue(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len-2];
        int[] suffix = new int[len-2];
        int temp = nums[0];
        for(int i = 0; i < len-2; i++){
            temp = Math.max(temp, nums[i]);
            prefix[i] = temp;
        }
        temp = nums[len-1];
        for(int i = len-1; i >= 2; i--){
            temp = Math.max(temp, nums[i]);
            suffix[i-2] = temp;
        }
        long ans = 0;
        for(int i = 1; i < len-1; i++){
            ans = Math.max((long)(prefix[i-1] - nums[i]) * (long)suffix[i-1], ans);
        }
        return ans;
    }
}