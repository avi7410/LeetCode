class Solution {
    public boolean isPowerOfTwo(int n) {
        return p2c(n, 0);
    }
    public boolean p2c(long n ,long x){
        long result = (long)Math.pow(2,x);
        if(result==n){
            return true;
        }
        else if(result<n){
            return p2c(n,++x);
        }
        return false;
    }
}