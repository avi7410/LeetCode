class Solution {
    public int minimumPushes(String word) {
        Integer[] charactersFreq = new Integer[26];
        Arrays.fill(charactersFreq, 0);
        for(int i = 0; i < word.length(); i++){
            charactersFreq[word.charAt(i) - 'a']+= 1;
        }
        Arrays.sort(charactersFreq, Collections.reverseOrder());
        int result = 0;
        int factor = 1;
        int count = 0;
        for(int i = 0; i < charactersFreq.length; i++){
            if(charactersFreq[i] == 0){
                break;
            }
            result += charactersFreq[i] * factor;
            count++;
            if(count == 8){
                factor++;
                count = 0;
            }
        }
        return result;
    }
}