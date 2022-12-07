import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd = 0; // 최대공약수(Greatest common divisor) 
    int lcm = 0; // 최소공배수(Least common multiple)

    for (int i = 1; i <= Math.min(a, b); i++) {
      if ((a % i == 0) && (b % i == 0)) {
        gcd = i;
      }
    }

    lcm = gcd * (a / gcd) * (b / gcd);

    System.out.println(gcd);
    System.out.println(lcm);

    sc.close();
  }
}