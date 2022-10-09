import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {


  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(stk.nextToken());
    int M = Integer.parseInt(stk.nextToken());

    int [] arr = new int[N + 1];

    stk = new StringTokenizer(br.readLine());

    for (int i = 1; i < N + 1; i++) {
      arr[i] = arr[i-1] + Integer.parseInt(stk.nextToken());
    }   

    int a = 0;
    int b = 0;

    for (int j = 0; j < M; j++) {
      if (j != 0 ) {
        bw.append('\n');
      }

      stk = new StringTokenizer(br.readLine());

      a = Integer.parseInt(stk.nextToken());
      b = Integer.parseInt(stk.nextToken());

      bw.append(String.valueOf(arr[b] - arr[a-1]));
    }

    bw.flush();
  }
}