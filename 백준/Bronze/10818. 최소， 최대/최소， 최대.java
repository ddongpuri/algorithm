import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    String[] arr = br.readLine().split(" ");

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int num = Integer.parseInt(arr[i]);

      max = Math.max(max, num);
      min = Math.min(min, num);
    }

    System.out.println(min + " " + max);

  }
}