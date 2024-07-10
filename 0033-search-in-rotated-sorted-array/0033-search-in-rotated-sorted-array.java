class Solution {
    public int search(int[] nums, int target) {
        int size=nums.length;
        int s=0;
        int e=size-1;
        int peak=0;
        if(nums[s]>nums[e]){
            while(s<e){
                int mid = s+(e-s)/2;
                if(mid<size-1 && nums[mid]>nums[mid+1]){
                    peak=mid;
                    break;
                }
                else if(mid>0 && nums[mid-1]>nums[mid]){
                    peak=mid-1;
                    break;
                }
                else if(nums[mid]<nums[s]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            if(target<nums[0]){
                s=peak+1;
                e=size-1;
                //right bs
                while(s<=e){
                int mid = s+(e-s)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
            }
            else{
                s=0;
                e=peak;
                //left bs
                while(s<=e){
                int mid = s+(e-s)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
            }
        }
        else{
            while(s<=e){
                int mid = s+(e-s)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
        }
    }
}