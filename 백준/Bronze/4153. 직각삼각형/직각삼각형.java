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
    String str;

    int[] arr = new int[3];

    while((str = br.readLine()) != null) {

      stk = new StringTokenizer(str);

      for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(stk.nextToken());
      }

      if (arr[0] == 0) {
        break;
      }

      Arrays.sort(arr);

      if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
        bw.append("right\n");
      } else {
        bw.append("wrong\n");
      }
    }

    bw.flush();


  }
}