
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] answers) {

            int one = 0;
    int two = 0;
    int three = 0;
    int max;
    LinkedList<Integer> l = new LinkedList<>();

    int[] supozaOne = new int[] {1, 2, 3, 4, 5};
    int[] supozaTwo = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
    int[] supozaThree = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == supozaOne[i % (supozaOne.length)]) one++;
    }

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == supozaTwo[i % (supozaTwo.length)]) two++;
    }

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == supozaThree[i % (supozaThree.length)]) three++;
    }

    max = Math.max(one, Math.max(two, three));

    if (one == max) l.add(1);
    if (two == max) l.add(2);
    if (three == max) l.add(3);

    int[] answer = new int[l.size()];

    for (int i = 0; i < l.size(); i++) {
      answer[i] = l.get(i);
    }

    Arrays.sort(answer);

        
        return answer;
    }
}