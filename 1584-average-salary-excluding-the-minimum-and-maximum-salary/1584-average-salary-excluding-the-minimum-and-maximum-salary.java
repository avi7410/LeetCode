class Solution {
    public double average(int[] salary) {
        double sum = 0;
        double min = salary[0];
        double max = salary[0];
        double temp = 0;
        for(int i=0; i<salary.length; i++){
            sum+=salary[i];
            temp=salary[i];
            if(temp<min){
                min = temp;
            }
            if(temp>max){
                max = temp;
            }
        }
        sum = sum - min - max;
        return (double)(sum/(salary.length-2));
    }
}