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

    int C = Integer.parseInt(br.readLine()); // 5
    int len = 0;
    double cnt;
    double total = 0;
    double avg = 0;

    for (int i = 0; i < C; i ++) {
      stk = new StringTokenizer(br.readLine());

      int[] arr = new int[Integer.parseInt(stk.nextToken())];

      cnt = 0;
      total = 0;
      len = arr.length;

      for (int j = 0; j < len; j++) {
        arr[j] = Integer.parseInt(stk.nextToken());
        total += arr[j];
      }

      avg = total / len;

      for (int k = 0; k < len; k++) {
        if (arr[k] > avg) {
          cnt++;
        }
      }

      System.out.println(String.format("%.3f", cnt/len * 100) + "%");
    }
  }
}