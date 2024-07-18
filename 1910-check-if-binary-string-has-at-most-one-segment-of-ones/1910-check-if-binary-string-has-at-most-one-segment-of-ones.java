class Solution {
    public boolean checkOnesSegment(String s) {
        String [] arr_str = s.split("");
        int count=0;
        for(int i=0 ;i<arr_str.length; i++){
            count+=Integer.valueOf(arr_str[i]);
        }
        boolean strt = false;
        for(int i=0 ;i<arr_str.length; i++){
            if(!strt){
                strt=true;
            }
            if(strt && Integer.valueOf(arr_str[i])==1){
                count--;
            }
            if(strt && Integer.valueOf(arr_str[i])!=1){
                break;
            }
        }
        return (count == 0) ? true : false;
    }
}