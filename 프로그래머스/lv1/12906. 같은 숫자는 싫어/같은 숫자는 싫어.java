import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
      LinkedList<Integer> queue = new LinkedList<>();

    for (int i = 0; i < arr.length; i++) {
      if (queue.isEmpty()) {
        queue.add(arr[i]);
      } else {
        if (queue.getLast() != arr[i]) {
          queue.add(arr[i]);
        }
      }
    }

    answer = new int[queue.size()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = queue.poll();
    }
        return answer;
    }
}