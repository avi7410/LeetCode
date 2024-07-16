class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String s : word1){
            str1.append(s);
        }
        for(String s : word2){
            str2.append(s);
        }
        String st1= str1.toString();
        String st2= str2.toString();
        if(st1.equals(st2)){
            return true;
        }
        return false;
    }
}