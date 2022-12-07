import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 2
// 6 12 10
// 30 50 72

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(stk.nextToken());
    int M = Integer.parseInt(stk.nextToken());

    int arr[][] = new int[N][M];

    for (int i = 0; i < arr.length; i++) {
      stk = new StringTokenizer(br.readLine());

      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = Integer.parseInt(stk.nextToken());
      }

    }

    for (int i = 0; i < arr.length; i++) {
      stk = new StringTokenizer(br.readLine());

      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] += Integer.parseInt(stk.nextToken());
      }

    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        bw.append(arr[i][j] + " ");
      }
      bw.append("\n");
    }


    bw.flush();
  }
}