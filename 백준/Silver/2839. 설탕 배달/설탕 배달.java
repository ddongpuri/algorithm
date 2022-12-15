import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    //    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Scanner sc = new Scanner(System.in);

    int c = sc.nextInt();

    int[] arr = new int[c + 1];

    Arrays.fill(arr, -1);


    if (c == 3) {
      System.out.println(1);
      return;
    } else if (c==4) {
      System.out.println(-1);
      return;
    } else if (c==5) {
      System.out.println(1);
      return;
    }

    arr[3] = 1;
    arr[5] = 1;

    for (int i = 6; i < arr.length; i++) {
      int a = arr[i - 3];
      int b = arr[i - 5];

      if (a != -1 && b != -1) {
        arr[i] = Math.min(a, b) + 1;
      } else if (a != -1 && b == -1) {
        arr[i] = a + 1;
      } else if (a == -1 && b != -1) {
        arr[i] = b + 1;
      }
    }


    System.out.println(arr[arr.length - 1]);

  }

}