class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] ans = {-1,-1};
    if(nums == null || nums.length == 0){
        return ans;
    }
    int index_of_target=indexfinder(nums, target);
    if (index_of_target==-1){
        return ans;
    }
    for(int i=index_of_target; i<nums.length; i++){
        if(nums[i]==target){
            ans[1]=i;
        }
        else{
            break;
        }
    }
    for(int i=index_of_target; i>=0; i--){
        if(nums[i]==target){
            ans[0]=i;
        }
        else{
            break;
        }
    }
    return ans;
    }

    public int indexfinder (int[] arr, int target){
        int mid; 
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            mid=start+((end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            else{
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}