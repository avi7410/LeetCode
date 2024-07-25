class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            max = Math.max(max, wordCounter(s));
        }
        return max;
    }

    public int wordCounter (String str){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}