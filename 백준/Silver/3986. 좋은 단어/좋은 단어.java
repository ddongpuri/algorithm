import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 단어의 수 
    int n = Integer.parseInt(br.readLine());
    int cnt = 0;

    Stack<Character> stack = new Stack<>();

    while (n-- > 0) {

      String str = br.readLine();

      if ((str.length() & 1) == 1) continue;

      for (int i = 0 ; i< str.length(); i++) {
        char c = str.charAt(i);

        if (!stack.isEmpty() && stack.peek() == c) {
          stack.pop();
        } else {
          stack.add(c);
        }
      }

      if (stack.isEmpty()) cnt++;

      stack.clear();
    }

    System.out.println(cnt);

  }
}