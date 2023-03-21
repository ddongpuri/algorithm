import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  static boolean[] visit = new boolean[200002];
  static int[] arr = new int[200002];
  static Queue<Integer> q = new ArrayDeque<>();
  static int n;
  static int k;

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    k = sc.nextInt();

    q.add(n);
    visit[n] = true;
    bfs();

    System.out.println(arr[k]);
    sc.close();
  }

  private static void bfs() {

    if (!q.isEmpty()) {
      int now = q.poll();

      if (now == k) return;

      if (now - 1 >= 0 && (now - 1) <= 100001 && !visit[now - 1]) {
        q.add(now-1);
        visit[now - 1] = true;
        arr[now - 1] = arr[now] + 1;
      }

      if ((now + 1) <= 100001 && !visit[now + 1]) {
        q.add(now+1);
        visit[now + 1] = true;
        arr[now + 1] = arr[now] + 1;

      }

      if ((now * 2) <= 100001 && !visit[now * 2]) {
        q.add(now*2);
        visit[now * 2] = true;
        arr[now*2] = arr[now] + 1;

      }

      bfs();
    }

    return;
  }

}