class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length < nums2.length){
            return helper(nums2, nums1);
        }
        return helper(nums1, nums2);
    }
    private int[] helper(int[] nums1, int[] nums2){
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }
}