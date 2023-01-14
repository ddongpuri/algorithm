import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int total = n + m;
    int k = sc.nextInt();

    int z = Math.min(n / 2, m);

    for (int i = z; i >= 0; i--) {
      if (total - 3 * i >= k) {
        System.out.println(i);
        return;
      }
    }
  }
}