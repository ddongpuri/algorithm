import java.io.IOException;
import java.util.Scanner;
/*도 3 A
 * 개 2 B
 * 걸 1 C
 * 윷 0 D
 * 모 4 E
 * D C B A E
 * */
public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int oddSum = 0;
    int oddMin = Integer.MAX_VALUE;

    for (int i = 0; i < 7; i++) {
      int num = sc.nextInt();

      if ((num & 1) == 1) {
        oddSum += num;
        oddMin = Math.min(oddMin, num);
      }
    }

    if (oddSum == 0) {
      System.out.println(-1);
      return;
    }

    System.out.println(oddSum);
    System.out.println(oddMin);

    sc.close();

  }
}