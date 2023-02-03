import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int total = 0;
    String str;

    for (int i = 1; i <= n; i++) {
      total = 0;
      total += i;
      str = String.valueOf(i);

      for (int j = 0; j < str.length(); j++)
        total += str.charAt(j) - '0';

      if (total == n) {
        System.out.println(i);
        return;
      }
    }

    System.out.println(0);

  }
}