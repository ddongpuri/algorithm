import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs;

    int[] arr = new int[11];
    arr[0] = 0;

    for (int i = 1; i < arr.length; i++) {
      strs = br.readLine().split(" ");
      arr[i] = arr[i-1] - Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]);
    }

    Arrays.sort(arr);

    System.out.println(arr[arr.length - 1]);
  }
}