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

    stk = new StringTokenizer(br.readLine());

    int[] arr = new int[2];

    arr[0] = Integer.parseInt(stk.nextToken());
    arr[1] = Integer.parseInt(stk.nextToken());

    Arrays.sort(arr);

    if (arr[0] == arr[1]) {
      sb.append(0 + "\n");
    } else {
      sb.append(arr[1] - arr[0] - 1 + "\n");
    }

    for (int i = arr[0] + 1; i < arr[1]; i++) {
      sb.append(i + " ");
    }

    System.out.println(sb);
  }
}