class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();

        for(Character ch: s.toCharArray()) {
            maps.put(ch, maps.getOrDefault(ch, 0) + 1);
        }

        for(Character ch: t.toCharArray()) {
            mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
        }

        if(maps.equals(mapt)) return true;

        return false;
    }
}
