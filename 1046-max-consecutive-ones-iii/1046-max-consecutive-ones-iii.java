class Solution {
    public int longestOnes(int[] nums, int k) {
        if(k >= nums.length) return nums.length;
        int i = 0;
        int j = 0;
        int zeroCount = 0;
        int ans = 0;
        while(j < nums.length){
            if(nums[j] == 1){
            }
            else{
                zeroCount ++;
                if(zeroCount > k){
                    while(i <= j && zeroCount > k){
                        if(nums[i] == 0){
                            zeroCount--;
                        }
                        i++;
                    }
                }
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
    return ans;
    }
}