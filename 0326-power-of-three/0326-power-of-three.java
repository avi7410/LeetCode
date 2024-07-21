class Solution {
    public boolean isPowerOfThree(int n) {
        return p3c(n,0);
    }
    public boolean p3c(long n ,long x){
        long result = (long)Math.pow(3,x);
        if(result==n){
            return true;
        }
        else if(result<n){
            return p3c(n,++x);
        }
        return false;
    }
}