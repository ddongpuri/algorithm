import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  static int n;
  static boolean[][] graph;
  static boolean[] visited;
  static StringBuilder sb;
  static Queue<Integer> q;

  public static void main(String[] args) {

    // 0. 입력 및 초기화 
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int m = sc.nextInt();
    int v = sc.nextInt();
    sb = new StringBuilder();

    graph = new boolean[n+1][n+1];
    visited = new boolean[n+1];

    // 1. graph 정보 입력
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      graph[a][b] = true;
      graph[b][a] = true;
    }

    // 2. dfs
    dfs(v);

    // visited 배열 초기화 
    for (int i = 1; i < n + 1; i++) {
      visited[i] = false; 
    }

    System.out.println(sb.substring(0, sb.length() - 1));
    sb = new StringBuilder();

    q = new LinkedList<>();
    // 3. bfs
    bfs(v);

    System.out.println(sb.substring(0, sb.length() - 1));
  }


  private static void dfs(int v) {

    if (visited[v]) return;

    visited[v] = true;
    sb.append(v).append(" ");

    for (int i = 1; i <= n; i++) {
      if (graph[v][i] && !visited[i]) {
        visited[v] = true;
        dfs(i);
      }
    }

    return;
  }

  private static void bfs(int v) {

    if (q.isEmpty()) {
      sb.append(v).append(" ");
      q.add(v);
    }

    visited[v] = true;
    q.poll();

    for (int i = 1; i <= n; i++) {
      if (graph[v][i] && !visited[i]) {
        visited[i] = true;
        q.add(i);
        sb.append(i).append(" ");
      }
    }

    if (!q.isEmpty()) {
      bfs(q.peek());
      return;
    }

    return;
  }

}