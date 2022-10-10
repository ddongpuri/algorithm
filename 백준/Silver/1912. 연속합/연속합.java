import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;  

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N+1];
    int[] dp = new int[N+1];

    stk = new StringTokenizer(br.readLine());

    for (int i = 1; i < N + 1; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    dp[1] = arr[1];

    for (int i = 2; i < N + 1; i++) {
      if (dp[i-1] + arr[i] > arr[i]) {
        dp[i] = dp[i-1] + arr[i];
      } else {
        dp[i] = arr[i];
      }
    }

    int max = Integer.MIN_VALUE;

    for (int i = 1; i < N + 1; i++) {
      max = Math.max(dp[i], max);
    }

    System.out.println(max);
  }
}