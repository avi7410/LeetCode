class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    helper(candidates, target, new ArrayList<Integer>(), result, 0);
    return result;
    }
    private void helper(int[] arr, int target, List<Integer> currentList, List<List<Integer>> ans, int idx){
        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(currentList));
            return;
        }
        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            currentList.add(arr[i]);
            helper(arr, target - arr[i], currentList, ans, i+1);
            currentList.remove(currentList.size()-1);
        }
    }
}