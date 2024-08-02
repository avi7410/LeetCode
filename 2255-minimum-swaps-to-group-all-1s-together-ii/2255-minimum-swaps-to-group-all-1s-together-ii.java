class Solution {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        if(totalOnes == n || totalOnes == 0){
            return 0;
        }

        int maxOnes = maxSubarrayOfOnes(nums, totalOnes);
        return totalOnes - maxOnes;
    }
    private int maxSubarrayOfOnes (int[] nums, int size){
        int idx = 1;
        int max = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 1){
                max++;
            }
        }
        int temp = max;
        int n = nums.length;
        while(idx < n){
            if(nums[idx-1] == 1){
                temp--;
            }
            if(nums[(idx+size-1) % n] == 1 ){
                temp++;
            }
            max = Math.max(temp, max);
            idx++;
        }
        return max;
    }
}