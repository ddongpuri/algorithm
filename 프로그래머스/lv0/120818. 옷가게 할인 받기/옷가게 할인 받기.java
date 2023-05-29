class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            answer = price * 4 / 5;
        } else if (price >= 300000) {
            answer = price * 9 / 10;
        } else if (price >= 100000) {
            answer = price * 95 / 100;
        } else {
            answer = price;
        }
        
        return answer;
    }
}