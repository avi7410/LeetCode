class Solution {
    public String finalString(String s) {
        String rev =" ";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
             if(s.charAt(i) =='i')
             sb=sb.reverse();
             else 
             sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}