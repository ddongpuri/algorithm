import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine(); // 문자열 
    String bomb = br.readLine(); // 폭발 문자열 

    Stack<Character> stack = new Stack<>(); 

    for (int i = 0; i < str.length(); i++) {
      stack.push(str.charAt(i)); // 문자열 글자 하나씩 넣기 

      if (stack.size() >= bomb.length()) { // 스택에 쌓인 문자 개수 >= 폭발 문자열의 길이 
        boolean isSame = true;

        for (int j = 0; j < bomb.length(); j++) {
          if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
            isSame = false;
            break;
          }
        }

        if (isSame) {
          for (int j = 0; j < bomb.length(); j++)
            stack.pop();
        }
      }
    }

    for (char ch : stack)
      sb.append(ch);

    System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
  }
}