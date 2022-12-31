import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 필드 수
    int z = sc.nextInt(); // 목적지 
    int m = sc.nextInt(); // 장애물 필드 개수
    int location;

    // n + 1 크기의 불린 배열을 만든다. (필드역할)
    boolean[] fields = new boolean[n + 1];

    // true로 초기화 
    for (int i = 0; i < fields.length; i++) fields[i] = true;

    // 장애물 있는 필드는 false값 넣어줌 
    for (int j = 0; j < m; j++) fields[sc.nextInt()] = false;

    for (int k = 1; k < z; k++) {

      location = 1;

      while (true) {

        location = (location + k) % n;

        if (location == 0 ) location =+ n ;

        if (location == 1 || !fields[location]) break;

        if (location == z) {
          System.out.println(k);
          return;
        }
      }
    }

    sc.close();
  }
}