class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                return false;
            }
        }
        return true;
    }
}