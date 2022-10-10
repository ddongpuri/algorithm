import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    int[] B = new int[N];
    int sum = 0;

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(A);

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(B);

    for (int i = 0; i < N; i++) {
      sum += A[i] * B[N-i-1];
    }

    System.out.println(sum);
  }
}