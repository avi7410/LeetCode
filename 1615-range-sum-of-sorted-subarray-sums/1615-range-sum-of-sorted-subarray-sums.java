class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                ans.add(sum);
            }
        }
        Collections.sort(ans);
        int result = 0;
        int MOD = 1000000007;
        for(int i = left - 1 ; i <= right - 1; i++){
            result += ans.get(i);
            result %= MOD;
        }
        return result;
    }
}