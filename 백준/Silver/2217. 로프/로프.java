import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int max = 0;
    int cnt = arr.length;

    for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] * cnt> max) max = arr[i] * cnt;
      cnt--;
    }

    System.out.println(max);

  }
}