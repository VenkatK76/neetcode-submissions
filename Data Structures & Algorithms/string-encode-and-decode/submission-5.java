class Solution {
    // ["Hello","World"]
    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder("");
        
        for(String str: strs) {
            sb.append(str.length()).append('|').append(str);
        }
        
        return sb.toString();
    
    }
    // 5#Hello5#World
    // ["we","say",":","yes","!@#$%^&*()"]
    // 2|we3|say1 |:3|yes  10|!@#$%^&*()
    // 0123456789 10         19
    // 14|India

    public int getLengthOfWord(String str, int i) {
        int index = str.indexOf('|', i);
        String s = str.substring(i, index);
        int number = Integer.parseInt(s);
        return number;
    }

    public List<String> decode(String str) { 
        List<String> result = new ArrayList<>();

        for(int i=0; i<str.length(); ) {
            
            int num = getLengthOfWord(str, i);
            
            int nod = String.valueOf(Math.abs(num)).length() + 1;

            int j = i+num+nod;
            
            String word = str.substring(i+nod, j);

            result.add(word);
            
            i+=(num+nod);
            
        }

        return result;
    
    }
}
