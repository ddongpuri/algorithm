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

      switch (command) {
              
          case "push":
          stack.push(sc.nextInt());
          continue;

          case "pop":
          sb.append(stack.isEmpty()? -1 : stack.pop());
          break;
              
          case "size":
          sb.append(stack.size());
          break;    

          case "empty":
          sb.append(stack.isEmpty()? 1 : 0);
          break;    

          case "top":
          sb.append(stack.isEmpty()? -1 : stack.peek());
          break;    
      }
      sb.append("\n");
    }

    System.out.println(sb);

  }
}