import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 2
// 6 12 10
// 30 50 72

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    int h = 0;
    int w = 0;

    int T = Integer.parseInt(br.readLine());
    int[][] arr = new int[T][3];

    for (int i = 0; i < arr.length; i++) {
      stk = new StringTokenizer(br.readLine());

      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = Integer.parseInt(stk.nextToken());
      }

      // 방의 층 수를 구한다.

      if (arr[i][2] % arr[i][0] == 0) {
        h = arr[i][0];

      } else {
        h = arr[i][2] % arr[i][0];
      }

      // 방의 호 수를 구한다. 
      w = ((arr[i][2] - 1) / arr[i][0]) + 1;

      bw.append(String.valueOf(h * 100 + w)).append("\n");
    }

    bw.flush();



  }
}