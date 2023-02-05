import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*도 3 A
 * 개 2 B
 * 걸 1 C
 * 윷 0 D
 * 모 4 E
 * D C B A E
 * */
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    StringBuilder sb = new StringBuilder();

    int n = 3;
    int sum = 0;
    char[] chars = new char[5];

    chars[0] = 'D';
    chars[1] = 'C';
    chars[2] = 'B';
    chars[3] = 'A';
    chars[4] = 'E';

    while (n > 0) {
      stk = new StringTokenizer(br.readLine());
      sum = 0;

      for (int i = 0; i < 4; i++) sum += Integer.parseInt(stk.nextToken());
      sb.append(chars[sum]).append("\n");

      n--;
    }

    System.out.println(sb);
  }
}