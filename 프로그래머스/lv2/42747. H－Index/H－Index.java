import java.io.IOException;
import java.util.Arrays;

class Solution {
    public int solution(int[] citations) throws IOException {
        int answer = 0;
        
        Arrays.sort(citations);
        
        int h = citations[citations.length - 1];
        int count = 0;

    for (int i = h; i >=0; i--) {

      count = 0;

      for (int j = citations.length - 1; j >= 0; j--) {
        if (citations[j] >= i) {
          count++;
        } else {
          break;
        }
      }

      if (count >= i) {
        answer = i;
        System.out.println(answer);
        return answer;
      }

    }
        
         return answer;
    }
}