import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int cnt = 0;
    int max = 0;
    double maxDra = -1000000000;
    double dradient = 0;

    int N = Integer.parseInt(br.readLine());

    int[] bldg = new int[N];

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) { // 빌딩들의 높이를 배열에 담는다. 
      bldg[i] = Integer.parseInt(stk.nextToken());
    }

    for (int i = 0; i < N; i++) {
      for (int j = i - 1; j >= 0; j--) {

        dradient = (bldg[j] - bldg[i]) / (double) Math.abs(j - i);

        if (dradient > maxDra) {
          cnt++;
          maxDra = dradient;
        }
      }

      maxDra = -1000000000;

      for (int k = i + 1; k < N; k++) {
        dradient = (bldg[k] - bldg[i]) / (double) Math.abs(k - i);

        if (dradient > maxDra) {
          cnt++;
          maxDra = dradient;
        }
      }

      if (cnt > max) {
        max = cnt;
      }

      maxDra = -1000000000;
      cnt = 0;
    }

    System.out.println(max);
  }

}