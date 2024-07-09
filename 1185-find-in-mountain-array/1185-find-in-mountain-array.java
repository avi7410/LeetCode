/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int size = mountainArr.length();
        int s=0;
        int e=size-1;
        int mid=0;
        while(s<e){
            mid = s+(e-s)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        int peak = s;
        if(mountainArr.get(peak)==target){
            return peak;
        }
        //left check BS
        s=0;
        e=peak;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        //right check BS
        s=peak;
        e=size-1;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)<target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}