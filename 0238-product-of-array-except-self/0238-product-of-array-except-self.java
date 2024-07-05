class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer = new int[n];
        int product =1;
        int zeros=0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                zeros++;
                continue;
            }
            product*=nums[i];
        }
        if(zeros>=2){
            return answer;
        }
        else if(zeros==0){
            for(int i=0; i<n ;i++){
                answer[i]=product/nums[i];
            }
            return answer;
        }
        else{
            for(int i=0; i<n; i++){
                if(nums[i]==0){
                    answer[i]=product;
                    break;
                }
            }
            return answer;
        }
    }
}