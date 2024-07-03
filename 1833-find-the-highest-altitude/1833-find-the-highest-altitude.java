class Solution {
    public int largestAltitude(int[] gain) {
        int alti=0;
        int max=alti;
        for(int i=0;i<gain.length;i++){
            alti+=gain[i];
            if(max<alti){
                max=alti;
            }
        }
        return max;
    }
}