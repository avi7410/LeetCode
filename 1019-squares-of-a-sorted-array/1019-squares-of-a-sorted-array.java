class Solution {
    public int[] sortedSquares(int[] nums) {
        int mid = binarySearchIdx(nums);
        int[] ans = new int[nums.length];
        int i = mid-1; 
        int j = mid;
        int idx = 0;
        while(i >= 0 && j < nums.length){
            if(nums[i] * nums[i] < nums[j] * nums[j]){
                ans[idx++] = nums[i] * nums[i];
                i--;
            }
            else{
                ans[idx++] = nums[j] * nums[j];
                j++;
            }
        }
        while(i >= 0){
            ans[idx++] = nums[i] * nums[i];
            i--;
        }
        while(j < nums.length){
            ans[idx++] = nums[j] * nums[j];
            j++;
        }
        return ans;
    }
    private int binarySearchIdx (int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(nums[mid] < 0 ){
                s = mid+1;
            } 
            else{
                e = mid;
            }
        }
        return s;
    }
}