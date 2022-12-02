import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Queue<Integer> queue = new LinkedList<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= N; i++) {
      queue.add(i);
    }

    while(queue.size() > 1) {
      queue.poll(); // 맨 위에 있는카드를 버린다. 

      queue.add(queue.poll()); // 맨 위에 있는 카드를 밑으로 옮긴다. 
    }

    System.out.println(queue.peek());


  }
}