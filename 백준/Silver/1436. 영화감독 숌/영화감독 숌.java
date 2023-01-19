import java.io.IOException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    sc.close();

    int cnt = 0;
    int titleNum = 666;

    while (true) {
      if (String.valueOf(titleNum).contains("666")) cnt++;

      if (cnt == n) {
        System.out.println(titleNum);
        return;
      }

      titleNum++;
    }

  }
}