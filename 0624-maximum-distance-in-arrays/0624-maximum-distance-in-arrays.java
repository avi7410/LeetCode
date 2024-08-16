class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i < arrays.size(); i++){
            ans = Math.max(ans, Math.abs(min - arrays.get(i).get(arrays.get(i).size()-1)));
            ans = Math.max(ans, Math.abs(max - arrays.get(i).get(0)));
            min = Math.min(min, arrays.get(i).get(0));
            max = Math.max(max, arrays.get(i).get(arrays.get(i).size()-1));
        }
        return ans;
    }
}