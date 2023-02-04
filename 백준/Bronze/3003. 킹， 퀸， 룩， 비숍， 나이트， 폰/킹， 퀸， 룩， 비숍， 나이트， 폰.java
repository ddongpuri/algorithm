import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    StringBuilder sb = new StringBuilder();

    stk = new StringTokenizer(br.readLine());

    int[] arr = new int[6];

    for (int i = 0; i < arr.length; i++) {
      if (i <= 1) arr[i] = 1;
      else if (i <= 4) arr[i] = 2;
      else arr[i] = 8;
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] - Integer.parseInt(stk.nextToken());
    }

    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);

      if (i == arr.length -1) {
        System.out.println(sb);
        return;
      }

      sb.append(" ");
    }


  }
}