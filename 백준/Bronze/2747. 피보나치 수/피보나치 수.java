import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    int fiboFirst = 0; // 0
    int fiboSecond = 1; // 1

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if (n == 1) {
      System.out.println(fiboSecond);
    } else {

      for (int i = 1; i <= n / 2; i++) {
        fiboFirst += fiboSecond;
        fiboSecond += fiboFirst;
      }

      if ((n & 1) == 0) {
        System.out.println(fiboFirst);
      } else {
        System.out.println(fiboSecond);
      }

    }

  }
}