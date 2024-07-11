class Solution {
    public int specialArray(int[] nums) {
        int s=0;
        int size=nums.length;
        int e=size;
        while(s<=e){
            int mid=s+(e-s)/2;
            int count_gr=0;
            for(int i=0;i<size; i++){
                if(nums[i]>=mid){
                    count_gr++;
                }
            }
            if(mid==count_gr){
                return mid;
            }
            else if(mid<count_gr){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}