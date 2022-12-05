import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    String brackets;
    Stack<String> stack = new Stack<>();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i ++) {

      brackets = br.readLine();

      for (int j = 0; j < brackets.length(); j++) {
        if (brackets.charAt(j) == '(') {
          stack.add("o");

        } else { // ')' 이거면 
          if (stack.isEmpty()) { // 스택이 비어있으면 
            bw.append("NO\n");
            break;

          } else {
            stack.pop();
          }
        }

        if (j == brackets.length() - 1) { // for 문 다 돌면 
          if (stack.isEmpty()) { bw.append("YES\n");} 
          else { bw.append("NO\n");}
        }
      }
      stack.clear();

    }
    bw.flush();

  }
}