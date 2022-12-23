import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int m;
  static int n;
  static int k;
  static boolean[][] field;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;

    int t = Integer.parseInt(br.readLine());
    int cnt;

    while (t > 0) {
      cnt = 0;
      t--;

      stk = new StringTokenizer(br.readLine());

      m = Integer.parseInt(stk.nextToken());
      n = Integer.parseInt(stk.nextToken());
      k = Integer.parseInt(stk.nextToken()); // 배추 개수 

      field = new boolean[m][n];

      int x = -1;
      int y = -1;

      for (int i = 0; i < k; i++) {
        stk = new StringTokenizer(br.readLine());
        x = Integer.parseInt(stk.nextToken());
        y = Integer.parseInt(stk.nextToken());

        field[x][y] = true;
      }


      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (k == 0) break;

          if (field[i][j]) { // 함수 호출 
            adjacent(i, j);
            cnt++;
          }
        }

        if (k == 0) break;
      }

      sb.append(cnt).append("\n");
    }

    System.out.println(sb);

  }

  static void adjacent(int x, int y) {

    if (x < 0 || x > m - 1) {
      return;
    }

    if (y < 0 || y > n - 1) {
      return;
    }

    if (field[x][y]) {
      field[x][y] = !field[x][y];
      k--;
      adjacent(x + 1,y);
      adjacent(x - 1,y);
      adjacent(x, y - 1);
      adjacent(x, y + 1);
    }

    return;

  }
}