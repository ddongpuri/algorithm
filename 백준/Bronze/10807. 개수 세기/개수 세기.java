import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    HashMap<Integer, Integer> map = new HashMap<>();

    int n = Integer.parseInt(br.readLine());

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {

      int k = Integer.parseInt(stk.nextToken());

      if (map.containsKey(k)) map.put(k, map.get(k) + 1);
      else map.put(k, 1);
    }

    int v = Integer.parseInt(br.readLine());

    System.out.println(map.getOrDefault(v, 0));
  }

}