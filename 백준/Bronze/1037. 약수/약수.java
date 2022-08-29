import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int min = 1000000;
    int max = 2;

    if (n == 1) {
      int n1 = sc.nextInt();
      System.out.println(n1 * n1);
      sc.close();
      return;
    }

    for (int i = 0; i < n; i++) {
      int temp = sc.nextInt();

      if (temp < min) {
        min = temp;
      }
      if (temp > max) {
        max = temp;
      }
    }
    System.out.println(min * max);

    sc.close();
    return;
  }
}