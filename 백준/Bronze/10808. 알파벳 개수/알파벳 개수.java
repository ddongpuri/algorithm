import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();

    int[] arr = new int[26];

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      arr[c - 97] += 1;
    }

    for (int n : arr) sb.append(n).append(" ");

    System.out.println(sb);
  }
}