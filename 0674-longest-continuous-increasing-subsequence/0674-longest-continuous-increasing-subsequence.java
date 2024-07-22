class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int subSeq= 1;
        int temp = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                temp=1;
            }
            else{
                temp++;
                if(temp>subSeq){
                    subSeq = temp;
                }
            }
        }
        return subSeq;
    }
}