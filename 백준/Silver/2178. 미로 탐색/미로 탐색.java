import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken());
    int m = Integer.parseInt(stk.nextToken());
    Queue<int[]> q = new ArrayDeque();

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    int[][] dist = new int[102][102];
    char[][] board = new char[102][102];


    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      board[i] = str.toCharArray();

      Arrays.fill(dist[i], -1);
    }

    dist[0][0] = 0;
    q.add(new int[] {0, 0});

    while(!q.isEmpty()) {

      int[] node = q.poll();

      for (int i = 0; i < 4; i++) {
        int nx = node[0] + dx[i];
        int ny = node[1] + dy[i];

        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        if (dist[nx][ny] >= 0 || board[nx][ny] != '1') continue;

        dist[nx][ny] = dist[node[0]][node[1]] + 1;
        q.add(new int[] {nx, ny});
      }
    }

    System.out.println(dist[n-1][m-1] + 1);
  }

}