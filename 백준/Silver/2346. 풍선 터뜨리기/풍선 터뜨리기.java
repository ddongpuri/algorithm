import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  static Deque<int[]> dq = new ArrayDeque<>();
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    int[] arr;
    int number;

    int n = Integer.parseInt(br.readLine());
    stk = new StringTokenizer(br.readLine());

    for (int i = 1; i <= n; i++) {
      arr = new int[2];
      arr[0] = Integer.parseInt(stk.nextToken());
      arr[1] = i;
      dq.add(arr);
    }

    sb.append(dq.peek()[1]).append(" ");
    number = dq.poll()[0];

    balloonPop(number);

    System.out.println(sb.substring(0, sb.length() - 1));
  }

  public static void balloonPop(int number) {

    if (dq.isEmpty()) {
      return;
    }

    int[] tmp;

    if (number > 0) {
      while (number != 1) {
        dq.addLast(dq.pollFirst());
        number --;
      }
      tmp = dq.pollFirst();

    } else {
      while (number != -1) {
        dq.addFirst(dq.pollLast());
        number++;
      }
      tmp = dq.pollLast();
    }

    sb.append(tmp[1]).append(" ");
    balloonPop(tmp[0]);

  }
}