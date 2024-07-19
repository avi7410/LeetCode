class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i=0;
        int size=nums.length;
        while(i<size){
            int crct_idx = nums[i]-1;
            if(crct_idx<size && nums[i]!=nums[crct_idx]){
                swap(nums, i, crct_idx);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<size; j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    public void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}