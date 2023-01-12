import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        
            Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new LinkedList<>();

    for (int i = 0; i < progresses.length; i++) {
      int workLeft = 100 - progresses[i];
      int days = workLeft / speeds[i];

      if (workLeft % speeds[i] != 0) days += 1;

      queue.add(days);
    }

    int doFirst;
    int cnt = 0;

    while (!queue.isEmpty()) {
      doFirst = queue.peek();

      while (!queue.isEmpty() && doFirst >= queue.peek()) {
        cnt++;
        queue.poll();
      }

      list.add(cnt);
      cnt = 0;
    }


    answer = new int[list.size()];

    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }
        return answer;
    }
}