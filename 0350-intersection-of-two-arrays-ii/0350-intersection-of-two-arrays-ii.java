class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int idx = 0;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = idx; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                    idx = j+1 ;
                    break;
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}