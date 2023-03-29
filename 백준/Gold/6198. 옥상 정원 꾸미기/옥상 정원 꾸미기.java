import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    Stack<Long> s = new Stack<>();

    long ans = 0;
    long h;

    while (n-- > 0) {
      h = Integer.parseInt(br.readLine());

      while (!s.empty() && s.peek() <= h) {
        s.pop();
      }
      ans += s.size();
      s.add(h);
    }
    System.out.println(ans);
  }
}