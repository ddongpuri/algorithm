import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int n = Integer.parseInt(br.readLine());

    int[][] homes = new int[n+1][3];

    for (int i = 1; i < n+1; i++) {
      stk = new StringTokenizer(br.readLine());

      homes[i][0] = Integer.parseInt(stk.nextToken());
      homes[i][1] = Integer.parseInt(stk.nextToken());
      homes[i][2] = Integer.parseInt(stk.nextToken());
    }

    int[][] dp = new int[n+1][3];

    for (int i = 1; i < n+1; i++) {
      dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + homes[i][0];
      dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + homes[i][1];
      dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + homes[i][2];

    }

    int budget = Integer.MAX_VALUE;

    for (int i = 0; i < 3; i++) budget = Math.min(dp[n][i], budget);

    System.out.println(budget);
  }
}