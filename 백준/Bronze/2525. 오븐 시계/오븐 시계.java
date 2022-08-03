import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int m = sc.nextInt();
    int cookingTime = sc.nextInt();

    int afterCookh = 0;
    int afterCookm = 0;

    afterCookm = (m + cookingTime) % 60;
    afterCookh = (h + (m + cookingTime)/60) % 24;

    System.out.printf("%d %d", afterCookh, afterCookm);

    sc.close();
  }
}
