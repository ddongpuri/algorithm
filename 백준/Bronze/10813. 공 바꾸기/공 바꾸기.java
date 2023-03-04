import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int n = sc.nextInt();
    int m = sc.nextInt();
    int tmp = 0;

    int[] arr = new int[n+1];

    for (int i = 1; i < arr.length; i++) {
      arr[i] = i;
    }

    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      tmp = arr[a];
      arr[a] = arr[b];
      arr[b] = tmp;
    }

    for (int i = 1; i < arr.length; i++) {
      sb.append(arr[i] + " ");
    }

    System.out.println(sb.substring(0, sb.length() - 1));

  }
}