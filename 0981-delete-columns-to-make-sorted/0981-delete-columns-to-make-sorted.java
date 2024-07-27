class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        if(strs.length < 2){
            return 0;
        }
        for(int i = 0; i < strs[0].length(); i++){
            if(! checkSort(strs, i)){
                count++;
            }
        }
        return count;
    }

    private boolean checkSort (String[] str, int col){
        for(int i = 1; i < str.length; i++){
            if(str[i-1].charAt(col) > str[i].charAt(col)){
                return false;
            }
        }
        
        return true;
    }
}