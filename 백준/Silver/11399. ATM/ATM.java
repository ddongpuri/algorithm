import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    int[] ts = new int[N];
    int sum = 0;

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(arr);

    ts[0] = arr[0];

    for (int i = 1; i < N; i++) {
      ts[i] = ts[i-1] + arr[i];
    }

    for (int timeSpent : ts) {
      sum += timeSpent;
    }

    System.out.println(sum);

  }
}