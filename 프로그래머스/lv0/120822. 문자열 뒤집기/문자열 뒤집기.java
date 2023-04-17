import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        answer += sb.reverse();
        return answer;
    }
}