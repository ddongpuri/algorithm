import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;    

    int N = Integer.parseInt(br.readLine());

    int[][] classes = new int[N][];

    int k = 0;
    int p = 0;
    int cnt = 0;

    for (int i = 0; i < N; i++) {
      stk = new StringTokenizer(br.readLine());

      k = Integer.parseInt(stk.nextToken());

      classes[i] = new int[k];

      for (int j = 0; j < k; j++) {
        classes[i][j] = Integer.parseInt(stk.nextToken());
      }
    }

    int M = Integer.parseInt(br.readLine()); // 학생수 
    int[] availables = new int[51];

    for (int i = 0; i < M; i++) { // 5번 돌거야 

      stk = new StringTokenizer(br.readLine());

      p = Integer.parseInt(stk.nextToken());  // 8

      for (int j = 0; j < p; j++) {
        availables[Integer.parseInt(stk.nextToken())] = 1;
      }

      for (int l = 0; l < N; l++) { // 3번 돌자

        for (int t = 0; t < classes[l].length; t++) { // 수업 시수길이 

          if (availables[classes[l][t]] != 1) {
            break;
          }

          if (t == classes[l].length - 1) {
            cnt++;
          }
        }
      }

      System.out.println(cnt);

      cnt = 0;

      for (int arr = 0; arr < availables.length; arr++) {
        availables[arr] = 0;
      }

    }

  }
}