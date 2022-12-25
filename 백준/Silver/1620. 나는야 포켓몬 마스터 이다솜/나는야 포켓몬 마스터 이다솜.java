import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;
    HashMap<String, Integer> hashMapNameKey = new HashMap<>();
    HashMap<Integer, String> hashMapNumKey = new HashMap<>();

    int number;
    String name;

    stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken());
    int m = Integer.parseInt(stk.nextToken());

    for (int i = 1; i <= n; i++) {
      name = br.readLine();
      hashMapNameKey.put(name, i);
      hashMapNumKey.put(i, name);
    }

    for (int i = 0; i < m; i++) {
      name = br.readLine();
      if ((number = hashMapNameKey.getOrDefault(name, 0)) != 0) {
        sb.append(number).append("\n");
      } else {
        number = Integer.parseInt(name);
        sb.append(hashMapNumKey.get(number)).append("\n");
      }
    }

    System.out.println(sb);

  }
}