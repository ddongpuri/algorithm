import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    String impo = "Impossible";
    String po = "Possible";

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[26];

    for (int i = 0; i < n; i++) {

      String[] str = br.readLine().split(" ");

      if (str[0].length() != str[1].length()) {
        sb.append("Impossible" + "\n");
        continue;
      }

      for (int j = 0; j < str[0].length(); j++) {
        arr[str[0].charAt(j) - 97]++;
      }

      for (int k = 0; k < str[1].length(); k++) {
        arr[str[1].charAt(k) - 97]--;
      }

      for (int a = 0; a < arr.length; a++) {
        if (arr[a] != 0) {
          sb.append("Impossible" + "\n");
          break;
        }

        if (a == arr.length - 1) {
          sb.append("Possible\n");
        }
      }

      Arrays.fill(arr, 0);

    }

    System.out.println(sb);

  }
}