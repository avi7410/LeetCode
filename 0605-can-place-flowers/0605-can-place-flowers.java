class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(0);
        for(int i = 0; i < flowerbed.length; i++){
            al.add(flowerbed[i]);
        }
        al.add(0);
        int count = 0;
        for(int i = 1; i < al.size()-1; i++){
            if(al.get(i-1) == 0 && al.get(i) == 0 && al.get(i+1) == 0){
                i++;
                count++;
            }
        }
        if(count >= n) return true;
        return false;
    }
}