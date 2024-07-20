class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
/*        for(int i = 0; i < n; i++){
            for(int j = i; j>0; j--){
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }*/
        Arrays.sort(nums);
        return nums[n-k];
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}