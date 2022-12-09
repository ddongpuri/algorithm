import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q =  new LinkedList<>();
    LinkedList<Integer> l = (LinkedList) q;

    int N = sc.nextInt();
    String command = null;

    for (int i = 0; i < N; i ++) {

      command = sc.next();

      if(command.equals("push")) {
        q.add(sc.nextInt());
        continue;

      } else if (command.equals("pop")) {
        sb.append(q.peek() != null ? q.poll() : -1);  

      } else if (command.equals("size")) {
        sb.append(q.size());

      } else if (command.equals("empty")) {
        sb.append(q.isEmpty() ? 1 : 0);

      } else if (command.equals("front")) {
        sb.append(q.isEmpty() ? -1 : q.peek());

      } else if (command.equals("back")) {
        sb.append(q.isEmpty() ? -1 : l.getLast());
      }

      sb.append("\n");
    }

    System.out.println(sb);

  }
}