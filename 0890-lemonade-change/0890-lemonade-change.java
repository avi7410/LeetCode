class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int bill : bills){
            if(bill == 5){
                fives++;
                continue;
            }
            else if(bill == 10){
                if(fives >= 1){
                    fives--;
                    tens++;
                    continue;
                }
                else{
                    return false;
                }
            }
            else {
                if((tens >= 1) && (fives >= 1)){
                    tens--;
                    fives--;
                    continue;
                }
                else if(fives >= 3){
                    fives -= 3;
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}