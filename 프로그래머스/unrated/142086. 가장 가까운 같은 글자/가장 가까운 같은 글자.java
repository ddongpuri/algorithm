import java.util.*;

class Solution {
    public int[] solution(String s) {
    int[] alpha = new int[26];
    int[] result = new int[s.length()];
    Arrays.fill(alpha, -1);

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (alpha[c - 97] == -1) {
        result[i] = alpha[c - 97];
        System.out.println(alpha[c - 97]);
      } else {
        result[i] = i - alpha[c - 97];
        System.out.println(i - alpha[c - 97]);
      }

      alpha[c - 97] = i;
    }

    return result;

    }
}