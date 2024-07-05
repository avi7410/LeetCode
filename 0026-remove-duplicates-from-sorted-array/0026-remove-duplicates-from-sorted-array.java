class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0 ;i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                temp.add(nums[i]);
            }
        }
        if(nums.length-1!=nums.length-2){
            temp.add(nums[nums.length-1]);
        }
        int k=temp.size();
        for(int i=0; i<k; i++){
            nums[i]=temp.get(i);
        }
        return k;
    }
}