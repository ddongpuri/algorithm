import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    String str;
    int a;
    int b;

    while(true) {
      stk = new StringTokenizer(br.readLine());

      a = 0;
      b = 0;

      a = Integer.parseInt(stk.nextToken());
      b = Integer.parseInt(stk.nextToken());

      if (a == 0 && b == 0) {
        break;
      }

      bw.write(String.valueOf(a + b));
      bw.append('\n');
      bw.flush();

    }

    bw.close();
    br.close();


  }
}