import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main { // 앵무새 

  static int N;
  static String[] str;
  static Queue[] arr;
  static int cnt = 0;
  static boolean b = true;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    arr = new Queue[N+1];


    for (int i = 0; i < N + 1; i++) {
      str = br.readLine().split(" ");

      Queue<String> words = new LinkedList<>();

      for (int j = 0; j < str.length; j++) {
        words.add(str[j]);
      }
      arr[i] = words;
    }

    // 단어 체크하기
    while (!arr[N].isEmpty() && b) {
      for (int i = 0; i < N; i++) { // 각 앵무새의 첫 단어 듣기 
        if (!arr[i].isEmpty() && arr[i].peek().equals(arr[N].peek())) { 

          arr[i].poll();
          arr[N].poll();
          break;
        }

        if (i == N - 1) {
          b = false;
          System.out.println("Impossible");
          return;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      if (arr[i].size() != 0) {
        System.out.println("Impossible");
        return;
      }

      if (i == N - 1) {
        System.out.println("Possible");
        return;
      }
    }
  }

}