class Solution {
    public int majorityElement(int[] nums) {
        mergeSort(nums, 0, nums.length);
        return nums[nums.length/2];
    }
    private void mergeSort(int[] nums, int left, int right){
        if(right - left == 1){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid, right);
        
        merge(nums, left, mid, right);
        return;
    }
    private void merge(int[] nums, int left, int mid, int right){
        int mix[] = new int[right-left];
        int i = left;
        int j = mid;
        int k = 0;
        while(i < mid && j < right){
            if(nums[i] < nums[j]){
                mix[k++] = nums[i++];
            }
            else{
                mix[k++] = nums[j++];
            }
        }
        while(i < mid){
            mix[k++] = nums[i++];
        }
        while(j < right){
            mix[k++] = nums[j++];
        }
        for(int l = 0; l < mix.length; l++){
            nums[left+l] = mix[l];
        }
        return;
    }
}