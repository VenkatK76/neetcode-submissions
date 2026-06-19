class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = s.length();
        for(int left=0, right=l-1; left < l/2; left++,right--) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }
}
