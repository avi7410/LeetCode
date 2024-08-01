class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += encrypt(nums[i]);
        }
        return sum;
    }
    private int encrypt (int num){
        int max = 0;
        int count = 0;
        while(num > 0){
            int temp = num % 10;
            count = count * 10 + 1;
            if(temp > max){
                max = temp;
            }
            num = num / 10;
        }
        num = count * max;
        return num;
    }
}