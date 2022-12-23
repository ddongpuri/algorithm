import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String word = null;
    HashMap<Character, Integer> map = new HashMap<>();
    char c;
    int cnt = 0;

    int n = Integer.parseInt(br.readLine()); // 단어의 개수 n을 입력받는다. 

    for (int i = 0; i < n; i++) {
      word = br.readLine(); //그룹 단어인지 체크할 단어 

      for (int k = 0; k < word.length(); k++) {
        c = word.charAt(k);

        if (map.containsKey(c) && (k - map.get(c) > 1)) break;

        map.put(c, k);

        if (k == word.length() - 1) cnt++;

      }

      map.clear();
    }

    System.out.println(cnt);

  }
}