class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int num : nums){
            elementSum += num;
            digitSum += helper(num, 0);
        }
        return Math.abs(elementSum - digitSum);
    }
    private int helper (int num, int sum){
        if(num <= 9){
            sum += num;
            return sum;
        }
        sum += num % 10;
        num /= 10;
        return helper(num, sum);
    }
}