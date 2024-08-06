class Solution {
    public int minimumPushes(String word) {
        int[] charactersFreq = new int[26];
        for(int i = 0; i < word.length(); i++){
            charactersFreq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(charactersFreq);
        int result = 0;
        int idx = 25;
        int count = 0;
        int factor = 1;
        while(idx >= 0 && charactersFreq[idx] != 0){
            result += charactersFreq[idx] * factor;
            idx--;
            count++;
            if(count == 8){
                factor++;
                count = 0;
            }
        }
        return result;
    }
}