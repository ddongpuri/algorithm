import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int n = sc.nextInt();
    int cnt = 1;

    Stack<Integer> stack = new Stack<>();

    while (n > 0) {
      n--;
      int t = sc.nextInt();

      while (cnt <= t) {
        stack.push(cnt++);
        sb.append("+\n");
      }

      if (stack.peek() != t) {
        System.out.println("NO");
        return;
      }

      stack.pop();
      sb.append("-\n");
    }

    System.out.println(sb);
  }
}