import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack =  new Stack<>();

    int N = sc.nextInt();
    String command = null;

    for (int i = 0; i < N; i ++) {

      command = sc.next();

      if(command.equals("push")) {
        stack.push(sc.nextInt());
        continue;

      } else if (command.equals("pop")) {
        if (stack.isEmpty()) {
          sb.append(-1);
        } else {
          sb.append(stack.pop());  
        }

      } else if (command.equals("size")) {
        sb.append(stack.size());

      } else if (command.equals("empty")) {
        if (stack.isEmpty()) {
          sb.append(1);
        } else {
          sb.append(0);
        }

      } else if (command.equals("top")) {
        if (stack.isEmpty()) {
          sb.append(-1);
        } else {
          sb.append(stack.peek());
        }
      }

      sb.append("\n");
    }

    System.out.println(sb);

  }
}