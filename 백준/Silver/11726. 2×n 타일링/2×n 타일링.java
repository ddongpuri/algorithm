import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    int tmp;

    int n = sc.nextInt();

    int[] arr = new int[n+1];

    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < n+1; i++) {
      tmp = arr[i-1] + arr[i-2];
      arr[i] = tmp % 10007;
    }

    System.out.println(arr[n]);

  }
}