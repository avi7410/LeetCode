class Solution {
    public int findNumbers(int[] nums) {
        int even_num=0;
        for(int i=0;i<nums.length;i++){
            int counter=0;
            while(nums[i]>0){
                nums[i]/=10;
                counter++;
            }
            if(counter%2==0){
                even_num++;
            }
        }
        return even_num;
    }
}