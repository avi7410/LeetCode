class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++){
            if(words[i].length()<1){
                continue;
            }
            char ch_s = words[i].charAt(0);
            char ch_e = words[i].charAt(words[i].length()-1);
            if((ch_s == 'a' || ch_s == 'e' || ch_s == 'i' || ch_s == 'o' || ch_s == 'u') && (ch_e == 'a' || ch_e == 'e' || ch_e == 'i' || ch_e == 'o' || ch_e == 'u')){ 
                count++;
            }
        }
        return count;
    }
}