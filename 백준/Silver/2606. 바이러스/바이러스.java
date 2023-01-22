import java.util.Scanner;

public class Main {

  static boolean[] visited;
  static boolean[][] graph;
  static int cnt = 0;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 1. 컴퓨터의 수 
    int n = sc.nextInt();

    // 2. 연결되어 있는 간선의 수 
    int l = sc.nextInt();

    graph = new boolean[n+1][n+1];
    visited = new boolean[n+1];

    // 3. 연결정보를 2차원배열에 저장 
    for (int i = 0; i < l; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      graph[a][b] = true;
      graph[b][a] = true;
    }

    dfs(1);

    System.out.println(cnt - 1);

  }

  private static void dfs(int v) {

    if (visited[v]) {
      return;
    }

    visited[v] = true;
    cnt++;

    for (int i = 1; i < graph.length; i++) {
      if (graph[v][i] && !visited[i]) {
        dfs(i);
      }
    }

  }
}