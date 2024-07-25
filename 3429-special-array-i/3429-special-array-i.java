class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length < 2){
            return true;
        }
        for(int i = 1; i < nums.length; i++){
            if( (nums[i]+nums[i-1])%2==0 ){
                return false;
            }
        }
        return true;
    }
}