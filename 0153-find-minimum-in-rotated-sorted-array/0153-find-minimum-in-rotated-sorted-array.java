class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int size=nums.length;
        int e=size-1;
        if(nums[s]<=nums[e]){
            return nums[0];
        }
        else{
            int mid;
            while(s<e){
                mid=s+(e-s)/2;
                //System.out.println("s:"+s+" | e:"+e+" | "+"mid:"+mid);
                if(mid>0 && nums[mid-1]>nums[mid]){
                    return nums[mid];
                }
                else if(mid<size-1 && nums[mid]>nums[mid+1]){
                    return nums[mid+1];
                }
                else if(nums[mid]<nums[s]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            return -1;
        }
    }
}