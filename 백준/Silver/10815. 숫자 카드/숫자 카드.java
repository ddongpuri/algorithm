import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    StringBuilder sb = new StringBuilder();
    HashMap<Integer,Integer> map = new HashMap<>();

    int n = Integer.parseInt(br.readLine());

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) map.put(Integer.parseInt(stk.nextToken()), 1);

    int m = Integer.parseInt(br.readLine());

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < m; i++) sb.append(map.getOrDefault(Integer.parseInt(stk.nextToken()), 0)).append(" ");

    System.out.println(sb);
  }
}