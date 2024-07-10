class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss=0;
        int count=1;
        int pt=0;
        while(miss!=k){
            if(pt<arr.length && arr[pt]==count){
                count++;
                pt++;
                continue;
            }
            else{
                miss++;
                if(miss==k){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}