import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();

    Character[] chars = new Character[str.length()];

    for (int i = 0; i < str.length(); i++) chars[i] = str.charAt(i);

    Arrays.sort(chars, (a,  b) -> b.compareTo(a));

    for (int i = 0; i < str.length(); i++) sb.append(chars[i]);

    System.out.println(sb);
  }
}