class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(candidates, target, 0, new ArrayList<Integer>(), ans, 0);
        return ans;
    }
    private void helper(int[] arr, int target, int sum, List<Integer> p, List<List<Integer>> ans ,int idx){
        if(sum > target){
            return;
        }
        else if(sum == target){
            ans.add(new ArrayList<Integer>(p));
            return;
        }
        else{
            for(int i = idx; i < arr.length; i++){
                p.add(arr[i]);
                helper(arr, target, sum + arr[i], p, ans, i);
                p.remove(p.size()-1);
            }
            return;
        }
    }
}