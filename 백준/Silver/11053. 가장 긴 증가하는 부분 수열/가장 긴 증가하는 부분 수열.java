import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine()); // 수열A의 크기 

    int[] arr = new int[N+1]; // 수열A의 element를 담을 배열 
    int[] dp = new int[N+1]; // 부분수열의 최대길이 담을 배열
    Arrays.fill(dp, 1);
    dp[0] = 0;

    stk = new StringTokenizer(br.readLine());

    for (int i = 1; i < N + 1; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    // dp[1] = 1; // 앞에 원소가 없으니까, 자기 자신 하나만 원소로 가지는 수열 == 자기 자신으로 끝나는 가장 긴 수열 

    for (int i = 2; i < N + 1; i++) {
      for (int j = 1; j < i; j++) {
        if (arr[j] < arr[i]) {
          if (dp[i] < dp[j] + 1) {
            dp[i] = dp[j] + 1;
          }
        }
      }
    }

    Arrays.sort(dp);
    System.out.println(dp[dp.length - 1]);
  }
}