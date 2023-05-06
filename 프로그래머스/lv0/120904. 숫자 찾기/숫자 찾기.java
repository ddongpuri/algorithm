import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = -1;
   
        String number = " " + num + "";
        
        char c = Character.forDigit(k , 10);
   
        return number.indexOf(c);
    }
}