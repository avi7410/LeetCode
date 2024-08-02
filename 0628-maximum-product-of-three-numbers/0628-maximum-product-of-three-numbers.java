class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if((nums.length == 3) || (nums[nums.length-1] < 0) || (nums[0] >= 0)){
            return nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];
        }
        int maxPOS = nums[nums.length-3] * nums[nums.length-2] * nums[nums.length-1];
        int maxNEG = nums[0] * nums[1] * nums[nums.length-1];
        return Math.max(maxPOS, maxNEG);
    }
}