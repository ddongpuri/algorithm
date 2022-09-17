import java.util.Scanner;

public class Main {
  public static void main (String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int E = sc.nextInt();
    int S = sc.nextInt();
    int M = sc.nextInt();
    int year;

    for (int i = 1;;i++) {
      if ((i % 28 == S % 28) && (i % 19 == M % 19) && (i % 15 == E % 15)) {
        year = i;
        System.out.println(year);
        break;
      }
    }

    sc.close();
  }
}