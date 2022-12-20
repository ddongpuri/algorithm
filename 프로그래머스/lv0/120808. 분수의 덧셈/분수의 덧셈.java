class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        answer = new int[2];
        
        int deno = num1 * num2;
        int mole = denum1 * num2 + denum2 * num1;
        
        int n = Math.min(deno, mole);
        int gcd = 0;
        
        for (int i = 1; i <= n; i++) {
            if (deno % i == 0 && mole % i == 0) {
                gcd = i;
            }
        }
        
        answer[0] = mole / gcd;
        answer[1] = deno / gcd;
        
        
        return answer;
    }
}