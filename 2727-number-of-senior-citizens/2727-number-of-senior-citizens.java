class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            int ch1 =s.charAt(11) - '0';
            int ch2 =s.charAt(12) - '0';
            int age = ch1 *10 + ch2;
            if(age>60){count++;}
        }
        return count;
    }
}