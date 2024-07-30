class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(0);
        for(int i : flowerbed){
            al.add(i);
        }
        al.add(0);
        for(int i = 1; i < al.size()-1; i++){
            if(al.get(i-1) == 0 && al.get(i) == 0 && al.get(i+1) == 0){
                i++;
                n--;
            }
        }
        if(n <= 0) return true;
        return false;
    }
}