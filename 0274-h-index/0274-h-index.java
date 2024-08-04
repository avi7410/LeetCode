class Solution {
    public int hIndex(int[] citations) {
        int hIdx = 0;
        for(int i = 0; i <= citations.length; i++){
            int count = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= hIdx){
                    count++;
                }
            }
            if(count == hIdx){
                return hIdx;
            }
            else if(count > hIdx){
                hIdx++;
            }
            else if(count < hIdx){
                hIdx--;
                break;
            }
        }
        return hIdx;
    }
}