class Solution {
    public int repeatedNTimes(int[] nums) {
        boolean bool = false;
        int ans=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    ans=nums[i];
                    bool=true;
                    break;
                }
            }
            if(bool==true){
                break;
            }
        }
        return ans;
    }
}