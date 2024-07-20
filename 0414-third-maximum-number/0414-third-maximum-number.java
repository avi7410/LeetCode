class Solution {
    public int thirdMax(int[] nums) {
        insertion_sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        else{
            int count=2;
            for(int i=nums.length-2 ;i>=0; i--){
                if(nums[i]!=nums[i+1]){
                    count--;
                }
                if(count==0){
                    return nums[i];
                }
            }
            return nums[nums.length-1];
        }
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