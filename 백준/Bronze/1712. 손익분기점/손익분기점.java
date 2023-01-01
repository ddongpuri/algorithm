import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    final int A = sc.nextInt(); // 고정비용 
    final int B = sc.nextInt(); // 가변비용 
    final int C = sc.nextInt(); // 가격 
    int profit = C - B;
    int increment= C - B;
    int bep = 1;

    if (B >= C) bep = -1;
    else {
      while (profit <= A) {
        profit += increment;
        bep++;
      }
    }
    sc.close();
    System.out.println(bep);

  }
}