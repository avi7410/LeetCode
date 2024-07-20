class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int crct_idx = nums[i]-1;
            if(i!=crct_idx){
                if(nums[i]==nums[crct_idx]){
                    return nums[i];
                }
                swap(nums, i, crct_idx);
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}