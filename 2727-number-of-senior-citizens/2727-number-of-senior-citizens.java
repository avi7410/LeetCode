class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++){
            if(helper(details[i])){
                count++;
            }
            System.out.println("i : "+i+"| count : "+count);

        }
        return count;
    }
    public boolean helper (String s){
        int val = Integer.parseInt(s.substring(11,13));
        System.out.println(val);
        if(val > 60){
            return true;
        }
        return false;
    }
}