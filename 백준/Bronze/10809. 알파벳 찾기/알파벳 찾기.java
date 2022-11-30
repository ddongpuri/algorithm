import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    for (int i = 'a'; i <= 'z'; i++) {
      System.out.printf("%d ", str.indexOf((char)i));
    }

  }
}