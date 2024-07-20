class Solution {
    public int maxProduct(int[] nums) {
        insertion_sort(nums);
        //int n = nums.length;
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
    public void insertion_sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public void swap (int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}