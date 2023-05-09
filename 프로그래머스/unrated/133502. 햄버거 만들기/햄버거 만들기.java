import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            
            if (stack.size() >= 3 && ingredient[i] == 1) {
                int patty = stack.pop();
                int vege = stack.pop();
                int bread = stack.pop();
                
                if (patty == 3 && vege == 2 && bread == 1) {
                    answer++;
                    continue;
                    
                } else {
                    stack.push(bread);
                    stack.push(vege);
                    stack.push(patty);
                }
            }
            
            stack.push(ingredient[i]);
            
        }
        
        return answer;
    }
}