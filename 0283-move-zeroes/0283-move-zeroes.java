class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(temp[i] != 0){
                nums[idx] = temp[i];
                idx++;
            }
        }
        for(int i = idx; i < nums.length; i++){
            nums[i] = 0;
        }
        return;
}}