import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    int total = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      total += arr[i];
    }

    Arrays.sort(arr);
    System.out.println(total / 5);
    System.out.println(arr[arr.length / 2]);

  }
}