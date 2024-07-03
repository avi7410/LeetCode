class Solution {
    public boolean checkIfPangram(String sentence) {
        //'''97 and 122'''
        int det=0;
        for(int i =97;i<=122;i++){
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==i){
                    det++;
                    break;
                }
            }
        }
        if(det>=26){
            return true;
        }

        return false;

    }
}