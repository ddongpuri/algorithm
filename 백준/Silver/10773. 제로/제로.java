import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int K = Integer.parseInt(br.readLine());

    Stack stack = new Stack();  
    int n = 0;

    for (int i = 0; i < K; i++) {
      if ((n = Integer.parseInt(br.readLine())) == 0) {
        stack.pop();  
      } else {
        stack.push(n);
      }
    }

    int sum = 0;

    while (!stack.isEmpty()) {
      sum += (int) stack.pop();
    }

    System.out.println(sum);

  }
}