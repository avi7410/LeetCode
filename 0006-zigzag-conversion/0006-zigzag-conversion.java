class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int idx = 0;
        int row = 0;
        int col = 0;
        char[][] matrix = new char[numRows][s.length()];
        boolean flag = true;
        while(idx < s.length()){
            matrix[row][col] = s.charAt(idx);
            idx++;
            if(flag){
                row++;
                if(row == numRows){
                    flag = false;
                    row--;
                }
            }
            if(!flag){
                row--;
                col++;
                if(row == 0){
                    flag = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char[] chars : matrix){
            for(char ch : chars){
                if(ch != '\0'){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}