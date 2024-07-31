class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(ifExist(nums1[i], nums2)) {
                if(!(ifExist(nums1[i], ans))){
                    ans.add(nums1[i]);
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
    private boolean ifExist(int num, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }
    private boolean ifExist(int num, List<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            if(num == arr.get(i)){
                return true;
            }
        }
        return false;
    }
}