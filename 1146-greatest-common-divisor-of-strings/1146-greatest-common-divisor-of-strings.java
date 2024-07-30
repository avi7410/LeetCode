class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcdHelper(str1.length(), str2.length());
        int f = str1.length()/gcd;
        int g = str2.length()/gcd;
        String gcd_str = str2.substring(0, gcd);
        String s1 = gcd_str.repeat(f);
        String s2 = gcd_str.repeat(g);
        if(s1.equals(str1) && s2.equals(str2)){
            return gcd_str;
        }
        return "";
    }
    public int gcdHelper (int a, int b){
        if(a==0){
            return b;
        }
        return gcdHelper (b%a, a);
    }
}