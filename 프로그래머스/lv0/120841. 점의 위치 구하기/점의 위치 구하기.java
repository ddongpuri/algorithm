class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (dot[0] * dot[1] < 0) {
            if (dot[0] < 0) answer = 2;
            else answer = 4;
        } else {
            if (dot[0] < 0) answer = 3;
            else answer = 1;
        }
        
        return answer;
    }
}