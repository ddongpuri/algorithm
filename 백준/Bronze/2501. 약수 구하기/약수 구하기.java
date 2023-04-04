import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    HashSet<Integer> set = new HashSet<>();

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        set.add(i);
        set.add(n/i);
      }
    }

    if (k > set.size()) {
      System.out.println(0);
      return;
    }

    Integer[] arr = set.toArray(new Integer[0]);

    Arrays.sort(arr);

    System.out.println(arr[k-1]);
  }
}