class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                red++;
            }
            else if(nums[i]==1){
                white++;
            }
            else{
                blue++;
            }
        }
        int pt=0;
        while(pt<nums.length){
            if(red>0){
                nums[pt]=0;
                pt++;
                red--;
            }
            else if(white>0){
                nums[pt]=1;
                pt++;
                white--;
            }
            else{
                nums[pt]=2;
                pt++;
                blue--;
            }
        }
    }
}