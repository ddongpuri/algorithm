import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int [] arr = new int[n + 1];

    if (n == 1 || n == 0) {
      System.out.println(n);
      return;
    }

    arr[0] = 0;
    arr[1] = 1;

    for (int i = 2; i < n + 1; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    System.out.println(arr[n]);

  }
}