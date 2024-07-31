class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0; 
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums, idx, i);
                idx++;
            }
        }
        return;
    }
    public void swap (int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}