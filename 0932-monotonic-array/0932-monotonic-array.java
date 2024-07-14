class Solution {
    public boolean isMonotonic(int[] nums) {
        int s=0;
        int size=nums.length;
        int e=size-1;
        if(nums[0]<nums[e]){
            for(int i=0; i<size-1; i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=0; i<size-1; i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}