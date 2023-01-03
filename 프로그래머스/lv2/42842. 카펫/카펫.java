class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int length;
        int width;
        int total = brown + yellow;
        
        for (int i = 3; i <= total / 2; i++) {
            
            width = total / i;
            length = i;
            
            if (total % i == 0 && (length - 2) * (width - 2) == yellow) {
                answer[0] = width;
                answer[1] = length;
                return answer;
            }
        }
        
        return answer;

    }
}