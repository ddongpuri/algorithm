import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  static int[] selected = new int[3];
  static int[] cards;
  static int N;
  static int M;
  static int sum = 0;
  static int result = 0;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    N = Integer.parseInt(stk.nextToken());
    M = Integer.parseInt(stk.nextToken());

    cards = new int[N];

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      cards[i] = Integer.parseInt(stk.nextToken());
    }

    recur(0, 0);

    System.out.println(result);
  }

  static void recur(int selCnt, int idx) {

    if (selCnt == 3) {

      sum = selected[0] + selected[1] + selected[2];

      if (sum <= M && sum > result) {
        result = sum;
      }

      return;
    }

    if (idx == N) {
      return;
    }

    for (int i = idx; i < N; i++) {
      selected[selCnt] = cards[i];
      recur(selCnt + 1, i + 1);
    }

  }
}