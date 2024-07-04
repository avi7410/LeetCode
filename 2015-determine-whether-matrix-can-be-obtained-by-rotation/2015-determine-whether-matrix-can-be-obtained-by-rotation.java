class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean ans=false;
        if(comparison(mat,target)){
            ans=true;
        }
        else{
            mat=rotate90(mat);
            if(comparison(mat,target)){
                ans=true;
            }
            if(ans!=true){
                mat=rotate90(mat);
                if(comparison(mat,target)){
                ans=true;
                }
            }
            if(ans!=true){
                mat=rotate90(mat);
                if(comparison(mat,target)){
                ans=true;
                }
            }
        }
        return ans;
    }
    int [][] rotate90 (int[][] mat){
        int[][] ans = new int [mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                ans[j][(mat[i].length-1)-i]=mat[i][j];
            }
        }
        //print for checking
        /*for(int i=0; i<mat.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
        System.out.println();*/
        return ans;
    }
    boolean comparison (int[][] mat, int[][] target){
        boolean ans=true;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]!=target[i][j]){
                    ans=false;
                    break;
                }
            }
            if(ans==false){
                break;
            }
        }
        return ans;
    }
}