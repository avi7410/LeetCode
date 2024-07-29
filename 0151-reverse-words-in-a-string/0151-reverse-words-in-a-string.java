class Solution {
    public String reverseWords(String s) {
        String [] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(strs));
        for(int i = strs.length-1; i >= 0 ; i--){
            if(strs[i].length() < 1 || strs[i].charAt(0) == ' '){
                continue;
            }
            sb.append(strs[i]+" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}