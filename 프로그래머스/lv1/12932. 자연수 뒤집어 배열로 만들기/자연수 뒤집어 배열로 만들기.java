class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n); // 문자열로
        int[] answer = new int[number.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = number.charAt(number.length() -1 - i) - '0';
        }
        
        return answer;
    }
}