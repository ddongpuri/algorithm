import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static int m;
  static boolean[][] arr;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    n = Integer.parseInt(stk.nextToken());
    m = Integer.parseInt(stk.nextToken());

    arr = new boolean[n][m];
    int max = 0;
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      stk = new StringTokenizer(br.readLine());

      for (int j = 0; j < m; j++) if (Integer.parseInt(stk.nextToken()) == 1) arr[i][j] = true;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j]) {
          max = Math.max(max, bfs(i, j));
          cnt++;
        }
      }
    }

    System.out.println(cnt);
    System.out.println(max);

  }

  private static int bfs(int i, int j) {

    // i,j 가 범위를 벗어나는 경우 
    if (i < 0 || i >=n || j < 0 || j >= m) return 0;

    if (arr[i][j]) {
      arr[i][j] = false;
      return 1 + bfs(i-1,j) + bfs(i+1,j) + bfs(i,j-1) + bfs(i,j+1);
    }
    else return 0;

  }
}