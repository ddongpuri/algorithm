import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Main {

  public static void main(String[] args) throws IOException {

    Deque<Integer> dq = new LinkedList<>();
    int cnt = 0;
    int doll;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken());
    int k = Integer.parseInt(stk.nextToken());

    int index = 0;
    ArrayList<Integer> indexes = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    stk = new StringTokenizer(br.readLine());

    // 전체 인형 중 라이언 인형의 index를 저장한다. 
    for (int i = 0; i < n; i++) {
      if (Integer.parseInt(stk.nextToken()) == 1) indexes.add(i);
    }

    // 라이언 인형의 개수 자체가 k보다 작으면 -1을 출력하고 리턴 
    if (indexes.size() < k) {
      System.out.println(-1);
      return;
    }

    for (int i = 0; i <= indexes.size() - k; i++) {
      min = Math.min(min, indexes.get(i + k - 1) - indexes.get(i) + 1);
    }

    System.out.println(min);
  }
}