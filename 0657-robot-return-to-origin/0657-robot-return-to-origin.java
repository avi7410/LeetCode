class Solution {
    public boolean judgeCircle(String moves) {
        int LR=0;
        int UD=0;
        for(int i=0; i<moves.length(); i++){
            char c=moves.charAt(i);
            switch (c){

                case 'U':
                    UD++;
                    break;

                case 'D':
                    UD--;
                    break;

                case 'L':
                    LR--;
                    break;

                case 'R':
                    LR++;
                    break;

            }
        }
        if(LR==0 && UD==0){
            return true;
        }
        return false;
    }
}