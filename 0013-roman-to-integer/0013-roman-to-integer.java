class Solution {
    public int romanToInt(String s) {
        return helper(s, s.length()-1, 0);
    }

    public int helper (String s, int idx, int val){
        if(idx < 0){
            return val;
        }
        int x = valueOfroman(s.charAt(idx));
        if(idx < s.length()-1 && x < valueOfroman(s.charAt(idx+1))){
            val -= x;
        }
        else{
            val += x;
        }
        System.out.println("char : "+s.charAt(idx)+" | val : "+val);

        return helper(s, --idx, val);
    }

    public int valueOfroman (char ch){
        int x = 0;
        switch (ch){
            case 'I':
                x = 1;
                break;
            case 'V':
                x = 5;
                break;
            case 'X':
                x = 10;
                break;
            case 'L':
                x = 50;
                break;
            case 'C':
                x = 100;
                break;
            case 'D':
                x = 500;
                break;
            case 'M':
                x = 1000;
                break;
        }
        return x;
    }
}