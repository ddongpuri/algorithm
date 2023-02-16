import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static Queue<int[]> q;
  public static int[] dx;
  public static int[] dy;
  public static int n;
  public static int m;
  public static int[][] dist;
  public static int[][] board;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    m = Integer.parseInt(stk.nextToken());
    n = Integer.parseInt(stk.nextToken());
    q = new ArrayDeque<>();

    dx = new int[]{1, 0, -1, 0};
    dy = new int[]{0, 1, 0, -1};

    // 토마토가 익는데 걸리는 날짜를 저장 
    dist = new int[n][m];

    // 토마토 상태 저장 (익음 : 1, 안익음 : 0, 없음 : -1)
    board = new int[n][m];

    for (int i = 0; i < n; i++) {

      String[] str = br.readLine().split(" ");

      for (int j = 0; j < m; j++) board[i][j] = Integer.valueOf(str[j]);

      Arrays.fill(dist[i], -1);
    }

    // 익은 토마토가 있으면 해당 지점에서 bfs 시작 
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (board[i][j] == 1) {

          q.add(new int[] {i, j});
          dist[i][j] = 0;
        }
      }
    }

    bfs();

    int max = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (board[i][j] == 0) {
          System.out.println(-1);
          return;
        }

        if (max < dist[i][j]) max = Math.max(max, dist[i][j]);
      }
    }

    System.out.println(max);

  }

  public static void bfs() {

    while(!q.isEmpty()) {

      int[] node = q.poll();

      for (int i = 0; i < 4; i++) {
        int nx = node[0] + dx[i];
        int ny = node[1] + dy[i];

        // 범위를 벗어나면 무시 
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

        // 이미 지나간 것 || 막혀있는 것 
        if (dist[nx][ny] >= 0 || board[nx][ny] != 0) continue;

        dist[nx][ny] = dist[node[0]][node[1]] + 1;

        board[nx][ny] = 1;

        q.add(new int[] {nx, ny});
      }
    }

  }

}