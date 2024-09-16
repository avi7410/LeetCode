class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] timearr = new int[n];
        for(int i = 0; i < n; i++){
            timearr[i] = timeConvert(timePoints.get(i));
        }
        Arrays.sort(timearr);
        int mindiff = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            mindiff = Math.min(mindiff, Math.abs(timearr[i % n] - timearr[i - 1]));
        }
        mindiff = Math.min(mindiff, Math.abs((24 * 60) - timearr[n-1] + timearr[0]));
        return mindiff;
    }
    private int timeConvert(String str){
        int hours = Integer.parseInt(str.substring(0,2));
        hours *= 60;
        int minutes = Integer.parseInt(str.substring(3,5));
        minutes += hours;
        return minutes;
    }
}