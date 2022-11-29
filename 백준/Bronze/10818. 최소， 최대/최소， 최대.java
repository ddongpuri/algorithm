import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(arr);

    System.out.print(arr[0] + " " + arr[arr.length - 1]);

  }
}