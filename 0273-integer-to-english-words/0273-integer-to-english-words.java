class Solution {
    public String numberToWords(int num) {
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] others = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        StringBuilder sb = new StringBuilder();
        if(num == 0){
            sb.append("Zero");
        }
        else if(num < 10){
            sb.append(ones[num]);
        }
        else if(num < 20){
            sb.append(tens[num % 10]);
        }
        else if(num < 100){
            sb.append(others[num / 10] + ((num % 10 == 0) ? ("") : (" " + numberToWords(num % 10))));
        }
        else if(num < 1000){
            sb.append(numberToWords(num / 100) + " Hundred" + ((num % 100 == 0) ? ("") : (" " + numberToWords(num % 100))));
        }
        else if(num < 1000000){
            sb.append(numberToWords(num / 1000) + " Thousand" + ((num % 1000 == 0) ? ("") : (" " + numberToWords(num % 1000))));
        }
        else if(num < 1000000000){
            sb.append(numberToWords(num / 1000000) + " Million" + ((num % 1000000 == 0) ? ("") : (" " + numberToWords(num % 1000000))));
        }
        else{
            sb.append(numberToWords(num / 1000000000) + " Billion" + ((num % 1000000000 == 0) ? ("") : (" " + numberToWords(num % 1000000000))));
        }
        return sb.toString();
    }
}