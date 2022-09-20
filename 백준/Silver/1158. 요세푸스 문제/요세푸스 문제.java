import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main (String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.append('<');

    int N = sc.nextInt();
    int K = sc.nextInt();

    Queue<Integer> q = new LinkedList<>();
    ArrayList<Integer> polled = new ArrayList();

    for (int i = 1; i <= N; i++) {
      q.add(i);
    }


    while(!q.isEmpty()) {
      for (int i = 0; i < K - 1; i++) {
        q.add(q.poll());
      }
      bw.append(q.poll().toString());
      if (q.size() != 0) {
        bw.append(", ");
      }
    }
    bw.append('>');
    bw.flush();
    sc.close();
    bw.close();
  }
}