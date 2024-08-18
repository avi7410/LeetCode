class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> up = new ArrayList<Integer>();
        for(int num : nums){
            up.add(num);
        }
        helper(result, new ArrayList<Integer>(), up);
        return result;
    }
    private void helper(List<List<Integer>> ans, List<Integer> p, List<Integer> up){
        if(up.size() == 0){
            if(!(ans.contains(p))){
                ans.add(new ArrayList<>(p));
            }
            return;
        }
        for(int i = 0; i < up.size(); i++){
            int temp = up.get(i);
            p.add(temp);
            up.remove(i);
            helper(ans, p, up);
            up.add(i, temp);
            p.remove(p.size() - 1);
        }
    }
}