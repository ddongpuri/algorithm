import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());
    int[] arrN = new int[N];
    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < arrN.length; i++) {
      arrN[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(arrN);

    int M = Integer.parseInt(br.readLine());
    stk = new StringTokenizer(br.readLine());
    int a = 0;

    for (int i = 0; i < M; i++) {
      a = Integer.parseInt(stk.nextToken());

      if (Arrays.binarySearch(arrN, a)>= 0) {
        bw.append("1\n");

      } else {
        bw.append("0\n");
      }

    }

    bw.flush();
  }
}