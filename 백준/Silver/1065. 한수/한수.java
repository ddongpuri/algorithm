import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      if (i <= 10) {
        cnt++;
      } else if (i < 100) {
        cnt++;
      } else if (i < 1000) {
        if ((i/100 + i%10) == 2 * (i/10 - (i/100)*10) ) {
          cnt++;
        }
      }

    }

    System.out.println(cnt);
    sc.close();
  }

}