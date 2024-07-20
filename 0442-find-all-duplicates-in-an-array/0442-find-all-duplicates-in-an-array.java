class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
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
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
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