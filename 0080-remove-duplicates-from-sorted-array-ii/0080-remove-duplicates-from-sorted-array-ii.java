class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num : nums){
            if(i == 0 || i == 1 || num != nums[i - 2]){
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}