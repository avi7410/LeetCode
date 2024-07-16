class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int size=s.length();
        int half = size/2;
        int h1=0;
        int h2=0;
        for(int i=0; i<half; i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
{
                h1++;
            }
        }
        for(int i=half; i<size; i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
{
                h2++;
            }
        }
        return h1==h2;
    }
}