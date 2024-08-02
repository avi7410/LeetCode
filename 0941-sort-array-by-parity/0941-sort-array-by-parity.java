class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = nums.length-1;
        int j = 0;
        while( j < nums.length && i >= 0){
            while(i >= 0 && nums[i] % 2 != 0){
                i--;
            }
            while(j < nums.length && nums[j] % 2 == 0){
                j++;
            }
            if(j <= i){
                swap(nums, i, j);
                i--;
                j++;
            }
            else{
                break;
            }
        }
        return nums;
    }
    private void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}