import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  static int n; // 상근이가 가지고 있는 숫자 카드 개수 
  static int m; // 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 정수의 개수 
  static HashMap<Integer, Integer> map; 
  static StringTokenizer stk;

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    map = new HashMap<>(); // 숫자 - 개수 쌍을 저장할 HashMap
    StringBuffer sb = new StringBuffer();

    stk = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(stk.nextToken());

      map.put(num, map.getOrDefault(num, 0) + 1);  
        
    }

    m = Integer.parseInt(br.readLine());
    stk = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int num = Integer.parseInt(stk.nextToken());

      //      if (map.containsKey(num)) {
      //        sb.append(map.get(num) + " ");
      //
      //      } else {
      //        sb.append(0 + " ");
      //      }
      sb.append(map.getOrDefault(num, 0)).append(" ");
    }

    System.out.println(sb.toString());

  }
}