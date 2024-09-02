class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i = 0; i < chalk.length; i++){
            sum += chalk[i];
        }
        sum = k % sum; 
        for(int i = 0; i < chalk.length; i++){
            sum -= chalk[i];
            if(sum < 0){
                return i;
            }
        }
        return 0;
    }
}