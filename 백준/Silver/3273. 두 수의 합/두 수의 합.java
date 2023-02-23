import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    int cnt = 0;

    int n = Integer.parseInt(br.readLine());

    stk = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(br.readLine());
    int[] arr = new int[2000000];

    for (int i = 0; i < n; i++) {

      int a = Integer.parseInt(stk.nextToken());

      if (x >= a && arr[x - a] == 1) cnt++;

      arr[a] = 1;
    }

    System.out.println(cnt);

  }
}