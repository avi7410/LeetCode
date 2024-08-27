class Solution {
    public String removeTrailingZeros(String num) {
        int idx = -1;
        for(int i = num.length()-1; i >= 0; i--){
            if(num.charAt(i) != '0'){
                idx = i;
                break;
            }
        }
        return (idx != -1) ? (num.substring(0, idx + 1)) : ("");
    }
}