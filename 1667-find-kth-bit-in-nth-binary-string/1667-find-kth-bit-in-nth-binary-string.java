class Solution {
    public char findKthBit(int n, int k) {
        String s = new String();
        s = kString(n);
        return s.charAt(k-1);
    }
    public String kString (int n){
        StringBuilder sb = new StringBuilder();
        if(n == 1){
            sb.append("0");
            return sb.toString();
        }
        n-=1;
        String sPrev = kString(n);
        String invertedString = invertString(sPrev);
        String reversedString = reverseString(invertedString);
        sb.append(sPrev+"1"+reversedString);

        return sb.toString();
    }

    public String invertString (String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1')
            ch = '0';
            else
            ch = '1';
            sb.append(ch);
        }
        return sb.toString();
    }

    public String reverseString (String s){
        return new StringBuilder(s).reverse().toString();
    }
}