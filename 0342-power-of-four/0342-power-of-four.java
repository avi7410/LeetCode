class Solution {
    public boolean isPowerOfFour(int n) {
        return p4c(n,0);
    }
    public boolean p4c(long n ,long x){
        long result = (long)Math.pow(4,x);
        if(result==n){
            return true;
        }
        else if(result<n){
            return p4c(n,++x);
        }
        return false;
    }
}