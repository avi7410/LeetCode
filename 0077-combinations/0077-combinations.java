class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backTrack(ans, new ArrayList<Integer>(), n, k, 1);
        return ans;
    }
    private void backTrack (List<List<Integer>> ls, List<Integer> currAns, int num, int size, int id){
        if(size == 0){
        ls.add(new ArrayList<>(currAns));
        return;
        }
        for(int i = id ; i <= num; i++){
            currAns.add(i);
            backTrack(ls, currAns, num, size - 1, i + 1);
            currAns.remove(currAns.size()- 1);
        }
    }
}