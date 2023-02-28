import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[26];

    String word1 = br.readLine();
    String word2 = br.readLine();

    for (int i = 0; i < word1.length(); i++) arr[word1.charAt(i) - 'a']++;
    for (int i = 0; i < word2.length(); i++) arr[word2.charAt(i) - 'a']--;

    int cnt = 0;

    for (int a : arr) cnt += Math.abs(a);

    System.out.println(cnt);

  }
}