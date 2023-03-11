import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = 1;


    while (true) {
      if (n * (n+1) / 2 >= 1000) break;
      n++;
    }

    int[] arr = new int[n*(n+1) / 2 + 1];

    int idx = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        arr[idx] = arr[idx -1] + i;
        idx++;
      }
    }

    System.out.println(arr[b] - arr[a-1]);

  }
}