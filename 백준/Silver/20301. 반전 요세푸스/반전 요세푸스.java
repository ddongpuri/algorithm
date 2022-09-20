import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);
  static int cnt = 0;
  static int N;
  static int K;
  static int M;
  static boolean b = true;

  public static void main (String[] args) throws Exception {

    N = sc.nextInt();
    K = sc.nextInt();
    M = sc.nextInt();

    Deque<Integer> dq = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      dq.add(i);
    }

    while (!dq.isEmpty()) { // dqr가 비어있지 않는 동안만 
      if (b) {
        josephus(dq);
      } else {
        josephusReverse(dq);
      }
    }

  }

  public static void josephus(Deque<Integer> dq) throws IOException {
    for (int i = 0; i < K - 1; i++) {
      dq.addLast(dq.pollFirst());
    }
    System.out.println(dq.pollFirst());
    cnt++;

    if (cnt == M) {
      b = false;
    }
  }

  public static void josephusReverse(Deque<Integer> dq) throws Exception {
    for (int i = 0; i < K - 1; i++) {
      dq.addFirst(dq.pollLast());
    }
    System.out.println(dq.pollLast());
    cnt--;
    
    if (cnt == 0) {
      b = true;
    }
  }
}