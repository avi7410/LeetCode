class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }
    private int helper(int a, int b, int count){
        if(a == 0 || b == 0){
            return count;
        }
        if(a >= b){
            count += a/b;
            return helper(a%b, b , count);
        }
        else{
            count += b/a;
            return helper(a, b%a , count);
        }
    }
}