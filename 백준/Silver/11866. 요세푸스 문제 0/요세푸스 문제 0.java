import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = sc.nextInt();
    int K = sc.nextInt();
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      queue.add(i);
    }

    int order = 1;

    while (!queue.isEmpty()) {
      if (order % K == 0) {
        sb.append(queue.poll());

        if (!queue.isEmpty()) {
          sb.append(", ");
        }

      } else {
        queue.add(queue.poll());

      }

      order++;
    }

    System.out.println("<" + sb + ">");
  }
}