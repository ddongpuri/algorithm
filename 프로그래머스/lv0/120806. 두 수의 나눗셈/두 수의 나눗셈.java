class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double num3 = (double) num1/num2 * 1000;
        answer = (int) num3 / 1;
        
        return answer;
    }
}