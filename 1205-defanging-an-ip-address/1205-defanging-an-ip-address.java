class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        String[] temp = address.split("\\.");
        for(int i=0; i<4; i++){
            ans.append(temp[i]);
            if(i==3){
                break;
            }
            ans.append("[.]");
        }
        return ans.toString();
    }
}