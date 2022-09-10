import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int a; // 소수인지 판별할 수를 읽어서 담을 변수 
    int cnt = 0;

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      a = sc.nextInt();

      if (isPrime(a)) {
        cnt++;
      }
    }
    System.out.println(cnt);
    sc.close();

  }

  public static boolean isPrime(int a) {
    if (a < 2) {
      return false;
    }

    for (int i = 2; i * i <=a; i++) { // 소수가 아니라면, 2~루트a 중 하나로 나누었을 때 나머지가 0이 나와야함 
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}