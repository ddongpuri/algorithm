import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chars = s.toCharArray();
         StringBuilder sb = new StringBuilder();
         Arrays.sort(chars);
         sb.append(chars).reverse();
        
        return answer + sb;
    }
}