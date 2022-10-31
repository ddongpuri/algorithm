import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] words = br.readLine().split(" ");

    int len = words.length;
    int cnt = words.length;

    for (int i = 0; i < len; i++) {
      if (words[i].isEmpty()) {
        cnt--;
      }
    }

    System.out.println(cnt);

  }
}