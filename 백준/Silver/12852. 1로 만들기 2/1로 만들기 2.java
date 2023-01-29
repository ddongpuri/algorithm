import java.io.IOException;
import java.util.Scanner;

public class Main {

  static StringBuilder sb = new StringBuilder();
  static int[] dp;
  static int[] dpIdx;

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    dp = new int[n+1];
    dpIdx = new int[n+1];

    dp[0] = 0;
    dp[1] = 0;

    for (int i = 2; i < n+1; i++) {
      dp[i] = dp[i-1] + 1;
      dpIdx[i] = i - 1;

      if (i % 2 == 0 && dp[i] > dp[i/2] + 1) {
        dp[i] = dp[i/2] + 1;
        dpIdx[i] = i/2;
      }

      if (i % 3 == 0 && dp[i] > dp[i/3] + 1) {
        dp[i] = dp[i/3] + 1;
        dpIdx[i] = i/3;
      }
    }

    System.out.println(dp[n]);
    sb.append(n).append(" ");
    recur(n);

    System.out.println(sb);
    sc.close();
  }

  private static void recur(int n) {

    if (n == 1) return;

    sb.append(dpIdx[n]).append(" ");
    recur(dpIdx[n]);
    return;
  }
}