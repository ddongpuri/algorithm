import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    stk = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(stk.nextToken());
    int X =  Integer.parseInt(stk.nextToken());
    int cnt = 0;

    String[] numbers = br.readLine().split(" ");

    for (int i = 0; i < N; i++) {
      if (Integer.parseInt(numbers[i]) < X) {
        cnt++;
        if (cnt != 1) {
          bw.write(' ');
        }
        bw.write(numbers[i]);

      }
    }

    bw.flush();
  }
}