class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        StringBuilder sb = new StringBuilder();
        List<String> str = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++){
            for(int j = 0; j < words.get(i).length(); j++){
                if(words.get(i).charAt(j) == separator){
                    if(sb.length() >= 1){
                        str.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                else {
                    sb.append(words.get(i).charAt(j));
                    }
            }
            if(sb.length() >= 1){str.add(sb.toString());
            sb.setLength(0);}
        }
        return str;
    }
}