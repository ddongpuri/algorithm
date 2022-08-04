import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = n ; i >= 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.printf(" ");
      }
      for (int k = 0; k <= n - i; k++) {
        System.out.printf("*");
      }
      System.out.println();
    }
    sc.close();
  }
}