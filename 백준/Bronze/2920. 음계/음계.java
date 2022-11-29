import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[8];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int k = 0;

    if (arr[k] == 1) {

      while(k < arr.length - 1) {
        if (arr[k] + 1 != arr[k+1] ) {
          System.out.println("mixed");
          break;
        }
        k++;
      }

      if (k == arr.length - 1) {
        System.out.println("ascending");
      }


    } else if (arr[k] == 8) {
      while(k < arr.length - 1) {
        if (arr[k] - 1 != arr[k+1]) {
          System.out.println("mixed");
          break;
        }
        k++;
      }

      if (k == arr.length - 1) {
        System.out.println("descending");
      }

    } else {

      System.out.println("mixed");
    }
  }
}