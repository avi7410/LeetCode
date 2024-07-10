/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;
        int e=n;
        while(s<=n){
            int mid=s+(e-s)/2;
            if(isBadVersion(mid)!=isBadVersion(mid+1)){
                return mid+1;
            }
            else if(isBadVersion(mid-1)!=isBadVersion(mid)){
                return mid;
            }
            else if(isBadVersion(mid)==true){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return 0;
    }
}