class Solution {
    public boolean judgeCircle(String moves) {
        int Left = 0;
        int Right = 0;
        int Up = 0;
        int Down = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L'){
                Left--;
            }
            else if(moves.charAt(i)=='R'){
                Right++;
            }
            else if(moves.charAt(i)=='U'){
                Up++;
            }
            else{
                Down--;
            }
        }
        if(Left+Right==0 && Up+Down==0){
            return true;
        }
        else{
            return false;
        }
    }
}