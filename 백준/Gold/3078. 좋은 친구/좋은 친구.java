import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main { // 앵무새 

  public static void main(String[] args) throws Exception {

    long gfcnt = 0;
    int N = 0;
    int K = 0;
    int[] nameCnt = new int[21];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());
    N = Integer.parseInt(stk.nextToken()); 
    K = Integer.parseInt(stk.nextToken()); 

    Queue<String> gf = new LinkedList<>();
    String name;

    for (int i = 0; i < N; i++) {

      if (gf.size() == K + 1) {
        name = gf.peek();
        nameCnt[name.length()]--;
        gf.poll(); // 빼 줌 
      }

      name = br.readLine(); // 들어올 이름 
      gfcnt = gfcnt + nameCnt[name.length()]; // 들어올 이름과 길이가 같은 애들 수를 더해줌 
      gf.add(name); // 큐에 넣어줌 
      nameCnt[name.length()]++; // 이름 길이 위치의 수 하나 증가시킴 

    } // for문 끝 

    System.out.println(gfcnt);
  }

}