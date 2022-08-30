class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cntp = 0;
        int cnty = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                cntp++;
            }
            
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                cnty++;
            }
        }

        return cntp == cnty;
    }
}