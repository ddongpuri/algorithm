import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];

    String str = br.readLine();

    for (int i = 0; i < str.length(); i++) {
      int n = str.charAt(i) - 48;

      if (n == 6 || n == 9) {
        if (arr[6] > arr[9]) {
          arr[9]++;
        } else if (arr[6] < arr[9]) {
          arr[6]++;
        } else {
          arr[n]++;
        }
        continue;
      }

      arr[n]++;
    }

    Arrays.sort(arr);
    System.out.println(arr[arr.length - 1]);

  }
}