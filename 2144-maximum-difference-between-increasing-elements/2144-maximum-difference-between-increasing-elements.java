class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        int temp=0;
        boolean flag = false;
        int size =nums.length;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(nums[i]<nums[j]){
                    temp=nums[j]-nums[i];
                    flag=true;
                }
                if(temp>max){
                    max=temp;
                }
            }
        }
        if(flag==false){
            return -1;
        }
        return max;
    }
}