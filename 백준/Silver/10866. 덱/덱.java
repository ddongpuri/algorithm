import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    Deque<Integer> dq = new LinkedList<>();

    int N = sc.nextInt();
    String command = null;

    for (int i = 0; i < N; i ++) {

      command = sc.next();

      switch (command) {

        case "push_front":
          dq.addFirst(sc.nextInt());
          continue;

        case "push_back":
          dq.addLast(sc.nextInt());
          continue;  

        case "pop_front": 
          sb.append(dq.peekFirst() != null ? dq.pollFirst() : -1);  
          break;

        case "pop_back":   
          sb.append(dq.peekLast() != null? dq.pollLast() : -1);
          break;

        case "size": 
          sb.append(dq.size());
          break;

        case "empty":
          sb.append(dq.isEmpty() ? 1 : 0);
          break;

        case "front":
          sb.append(dq.isEmpty() ? -1 : dq.peekFirst());
          break;

        case "back":
          sb.append(dq.isEmpty() ? -1 : dq.peekLast());
          break;
      }

      sb.append("\n");
    }

    System.out.println(sb);

  }
}