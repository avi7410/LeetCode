class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < nums2.length; i++){
            nums1[m+i] = nums2[i];
        }
        mergeSort(nums1, 0, nums1.length);
        return;
    }
    public void mergeSort(int[] arr, int left, int right){
        if(right-left <= 1){
            return;
        }
        int mid = left + (right - left) / 2;
        
        mergeSort(arr, left, mid);
        mergeSort(arr, mid, right);

        merge(arr, left, mid, right);
    }
    public void merge(int[] arr, int s, int m ,int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e){
            if(arr[i] <= arr[j]){
                mix[k++] = arr[i];
                i++;
            }
            else{
                mix[k++] = arr[j];
                j++;
            }
        }

        while(i < m){
            mix[k++] = arr[i];
            i++;
        }
        while(j < e){
            mix[k++] = arr[j];
            j++;
        }
        for(int l = 0; l < mix.length; l++){
            arr[s+l] = mix[l];
        }
        return;
    }
}