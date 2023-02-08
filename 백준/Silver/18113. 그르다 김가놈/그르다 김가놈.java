import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int m;
  static List<Integer> list;  

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    n = Integer.parseInt(stk.nextToken());
    int k = Integer.parseInt(stk.nextToken());
    m = Integer.parseInt(stk.nextToken());
    int sum = 0;

    list = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(br.readLine());

      if (a > 2*k) list.add(a - 2*k);
      else if (2*k > a && a > k) list.add(a-k);

    }

    int st = 1;
    int en = 1000000000;
    int ans = -1;

    while (st <= en) {
      int mid = (st+en) / 2;

      if (solve(mid)) {
        ans = mid;
        st = mid + 1;

      } else {
        en = mid - 1;
      }
    }

    System.out.println(ans);
  }

  private static boolean solve(int x) {

    int cur = 0;

    for (int a : list)
      cur += a / x;

    return cur >= m;
  }
}