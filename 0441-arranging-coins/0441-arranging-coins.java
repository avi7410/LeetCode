class Solution {
    public int arrangeCoins(int n) {
        int s=1;
        int e=n;
        while(s<=e){
            int mid = s+(e-s)/2;
            long cmp = (long)mid*(mid+1)/2;
            if(cmp==n){
                return mid;
            }
            else if(cmp<n){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return e;
    }
}