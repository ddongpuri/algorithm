import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    while (t > 0) {
      int n = Integer.parseInt(br.readLine());

      int[] arr = new int[n];

      stk = new StringTokenizer(br.readLine()," ");

      for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(stk.nextToken());

      Arrays.sort(arr);

      int m = Integer.parseInt(br.readLine());

      stk = new StringTokenizer(br.readLine()," ");

      for (int i = 0; i < m; i++) {
        if (Arrays.binarySearch(arr, Integer.parseInt(stk.nextToken())) > -1) sb.append(1).append("\n");
        else sb.append(0).append("\n");
      }

      t--;
    }

    System.out.println(sb);

  }
}