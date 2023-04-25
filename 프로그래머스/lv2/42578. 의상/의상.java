import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            System.out.println(cloth[1]);
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        
        for (Integer count : map.values()) {
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}