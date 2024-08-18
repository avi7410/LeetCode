class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result, new ArrayList<Integer>(), nums, k, n, 0);
        return result;
    }
    private void helper(List<List<Integer>> result, List<Integer> p, int[] arr, int size, int target, int idx){
        if(target <= 0){
            if(target == 0 && p.size() == size){
                result.add(new ArrayList<>(p));
            }
            return;
        }
        for(int i = idx; i < arr.length; i++){
            p.add(arr[i]);
            helper(result, p, arr, size, target - arr[i], i + 1);
            p.remove(p.size() - 1);
        }
    }
}