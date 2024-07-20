class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crct_idx=nums[i]-1;
            if(nums[i]!=nums[crct_idx]){
                swap(nums, i, crct_idx);
            }
            else{
                i++;
            }
        }
        int[] ans = new int[2];
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}