class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if(
                a+b>c &
                b+c>a &
                c+a>b
            ){
                return a+b+c;
            }
        }
        return 0;
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