class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans= new ArrayList<Integer>();
        for(int i=0; i<words.length; i++){
            String temp = words[i];
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}