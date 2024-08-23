class Solution {
    public int findClosestNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int ans = nums[0];
        int minDis = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int tempDis = Math.abs(nums[i] - 0);
            if(minDis >= tempDis){
                if(minDis == tempDis){
                    ans = Math.max(ans, nums[i]);
                }
                else{
                    ans =nums[i];
                    minDis = tempDis;
                }
            }
        }
        return ans;
    }
}