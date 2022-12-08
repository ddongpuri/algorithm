import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  static StringTokenizer stk;
  static int n;
  static int m;
  static HashMap<Integer, Integer> map;

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    map = new HashMap<>();
    StringBuffer sb = new StringBuffer();

    stk = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(stk.nextToken());

      if(!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        map.put(num, map.get(num) + 1);
      }
    }

    m = Integer.parseInt(br.readLine());
    stk = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int num = Integer.parseInt(stk.nextToken());

      if (map.containsKey(num)) {
        sb.append(map.get(num) + " ");

      } else {
        sb.append(0 + " ");
      }
    }

    System.out.println(sb.toString());

  }
}