class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[cols * rows][2];
        int count = 0;
        int step = 0;
        while(count < cols * rows){
            step++;
            //right
            for(int i = 0; i < step; i++){
                if(cStart < cols && cStart >= 0 && rStart < rows && rStart >= 0){
                    result[count][0] = rStart;
                    result[count][1] = cStart;
                    count++;
                }
                cStart++;
            }
            //down
            for(int i = 0; i < step; i++){
                if(rStart < rows && rStart >= 0 && cStart < cols && cStart >= 0){
                    result[count][0] = rStart;
                    result[count][1] = cStart;
                    count++;
                }
                rStart++;
            }
            step++;
            if(count >= cols * rows){
                break;
            }
            //left
            for(int i = 0; i < step; i++){
                if(cStart < cols && cStart >= 0 && rStart < rows && rStart >= 0){
                    result[count][0] = rStart;
                    result[count][1] = cStart;
                    count++;
                }
                cStart--;
            }
            //up
            for(int i = 0; i < step; i++){
                if(rStart < rows && rStart >= 0 && cStart < cols && cStart >= 0){
                    result[count][0] = rStart;
                    result[count][1] = cStart;
                    count++;
                }
                rStart--;
            }
        }
        return result;
    }
}