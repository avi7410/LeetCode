class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int size=nums.length;
        int e=size-1;
        while(s<e){
            int mid = s + ( e - s ) / 2;
            if(nums[mid]<nums[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}