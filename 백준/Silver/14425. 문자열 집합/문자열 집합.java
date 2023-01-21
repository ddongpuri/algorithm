import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int cnt = 0;

    HashSet<String> s = new HashSet<>();

    for (int i = 0; i < n; i++) s.add(sc.next());

    for (int k = 0; k < m; k++) {
      if(s.contains(sc.next())) cnt++;
    }

    System.out.println(cnt);
  }
}