import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int max = 0;
    int cnt = arr.length;

    for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(br.readLine());

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] * cnt> max) max = arr[i] * cnt;
      cnt--;
    }

    System.out.println(max);

  }
}