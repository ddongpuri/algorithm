import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int k;
  static int[] arr;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    arr = new int[10001];

    stk = new StringTokenizer(br.readLine());

    k = Integer.parseInt(stk.nextToken());
    n = Integer.parseInt(stk.nextToken());

    for (int i = 0; i < k; i++) arr[i] = Integer.parseInt(br.readLine());

    long st = 1;
    long en = 0x7fffffff; // 2^31 -1

    while (st < en) {
      long mid = (st+en+1) / 2;

      if (solve(mid)) st = mid;
      else en = mid - 1;
    }
    System.out.println(st);
  }

  private static boolean solve(long x) {
    long cur = 0;
    for (int i = 0; i < k; i++) cur += arr[i] / x;

    return cur >= n;
  }
}