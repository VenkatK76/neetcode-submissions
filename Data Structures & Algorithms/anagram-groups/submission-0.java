class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // ["act","pots","tops","cat","stop","hat"]
        // ["act", "opst", "opst", "act", "opst", "aht"]
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String  s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        ArrayList res = new ArrayList<>();
        map.forEach((key, value) -> {
            res.add(value);
        });

        return res;
    }
}
