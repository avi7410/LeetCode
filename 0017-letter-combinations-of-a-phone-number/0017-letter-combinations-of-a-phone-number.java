class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits.isEmpty()){
            return ans;
        }
        ans.addAll(letterCombinationsFinder("", digits));
        return ans;
    }
    private List<String> letterCombinationsFinder (String p, String up){
        if(up.isEmpty()){
            List<String> result = new ArrayList<String>();
            result.add(p);
            return result;
        }
        List<String> result = new ArrayList<String>();
        int digit = up.charAt(0) - '0';
        String mapping = mappingHelper(digit);
        for(int i = 0; i < mapping.length(); i++){
            char ch = mapping.charAt(i);
            result.addAll(letterCombinationsFinder(p + ch, up.substring(1)));
        }
        return result;
    }
    private String mappingHelper (int digit){
        switch (digit){
            case 2 : 
                return "abc";
            case 3 :
                return "def";
            case 4 :
                return "ghi";
            case 5 :
                return "jkl";
            case 6 :
                return "mno";
            case 7 :
                return "pqrs";
            case 8 :
                return "tuv";
            case 9 :
                return "wxyz";
        }
        return "";
    }
}