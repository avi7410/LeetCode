class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(nums, new ArrayList<Integer>(), ans);
        return ans;
    }
    private void helper(int[] arr, List<Integer> currentList, List<List<Integer>> result){
        if(currentList.size() == arr.length){
            result.add(new ArrayList<>(currentList));
            return;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(currentList.contains(arr[i])){
                    continue;
                }
                currentList.add(arr[i]);
                helper(arr, currentList, result);
                currentList.removeLast();
            }
        }
    }
}