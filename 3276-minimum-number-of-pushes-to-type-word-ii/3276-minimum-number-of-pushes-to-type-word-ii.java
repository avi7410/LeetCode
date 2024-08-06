class Solution {
    public int minimumPushes(String word) {
        int[] charactersFreq = new int[26];
        Arrays.fill(charactersFreq, 0);
        for(int i = 0; i < word.length(); i++){
            charactersFreq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(charactersFreq);
        int result = 0;
        int idx = charactersFreq.length-1;
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