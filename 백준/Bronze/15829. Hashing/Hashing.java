import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int result = 0;
    int multiple = 1;
    int l = sc.nextInt();

    String str = sc.next();

    for (int i = 0; i < l; i++) {
      if (i != 0) multiple *= 31;

      result += (str.charAt(i) - 96) * multiple;
    }

    System.out.println(result);

    sc.close();
  }
}