import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    String[] arr = sc.next().split("/");

    int K = Integer.parseInt(arr[0]);
    int D = Integer.parseInt(arr[1]);
    int A = Integer.parseInt(arr[2]);

    if (K + A < D || D == 0) {
      System.out.println("hasu");
    } else {
      System.out.println("gosu");
    }

  }
}