class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i = 0; i < nums.length; i++){
            elementSum += nums[i];
            digitSum += helper(nums[i], 0);
        }
        return Math.abs(elementSum - digitSum);
    }
    private int helper (int num, int sum){
        if(num <= 0){
            return sum;
        }
        sum += num % 10;
        num /= 10;
        return helper(num, sum);
    }
}