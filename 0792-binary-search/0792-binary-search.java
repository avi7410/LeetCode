class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums,0,nums.length-1,target);
    }
    public int binary_search (int[] arr, int s, int e , int target){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        return (arr[mid]<target) ? (binary_search(arr, mid+1, e, target)) : (binary_search(arr, s, mid-1, target));
    }
}