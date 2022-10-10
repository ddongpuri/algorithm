import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(stk.nextToken());
    int value = Integer.parseInt(stk.nextToken());
    int count = 0;

    int[] coins = new int[N];

    for (int i = 0; i < N; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    for (int i = N - 1; i >= 0; i--) {
      if (coins[i] > value) {
        continue;
      }

      count += value / coins[i];
      value = value % coins[i];
    }

    System.out.println(count);
  }
}