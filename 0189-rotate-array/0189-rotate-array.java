class Solution {
    public void rotate(int[] nums, int k) {
        int s=nums.length;
        k=k%s;
        int[] temp = new int[s];
        int index=0;
        for(int i=0; i<s; i++){
            index=(k+i)%s;
            temp[index]=nums[i];
        }
        for(int i=0; i<s; i++){
            nums[i]=temp[i];
        }
    }
}