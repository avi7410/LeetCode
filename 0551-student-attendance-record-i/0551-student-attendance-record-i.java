class Solution {
    public boolean checkRecord(String s) {
        int lateCount = 0; 
        int absentCount = 0;
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)) {

                case 'A' : 
                    absentCount++;
                    lateCount=0;
                    break;
                
                case 'L' : 
                    lateCount++;
                    break;

                default :
                    lateCount=0;
                    break;

            }
            if(lateCount > 2){
                return false;
            }
            if(absentCount > 1){
                return false;
            }
        }
        return true;
    }
}