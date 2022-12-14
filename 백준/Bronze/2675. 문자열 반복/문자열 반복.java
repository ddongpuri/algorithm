import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    int T = Integer.parseInt(br.readLine());
    int R = 0;
    String S;

    for (int i = 0; i < T; i ++) {
      stk = new StringTokenizer(br.readLine());

      R = Integer.parseInt(stk.nextToken());
      S = stk.nextToken();

      for (int j = 0; j < S.length(); j++) {
        for (int k = 0; k < R; k++) {
          bw.append(S.charAt(j));
        }
      }
      bw.append('\n');

      bw.flush();
    }

  }
}