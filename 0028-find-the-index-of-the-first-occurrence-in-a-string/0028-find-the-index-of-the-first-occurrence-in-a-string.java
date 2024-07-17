class Solution {
    public int strStr(String haystack, String needle) {
        int size1 = haystack.length();
        int size2 = needle.length();
        for(int i=0; i<=size1-size2; i++){
            for(int j=0; j<size2; j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    if(j==size2-1){
                        return i;
                    }
                    continue;
                }
                break;
            }
        }
        return -1;
    }
}