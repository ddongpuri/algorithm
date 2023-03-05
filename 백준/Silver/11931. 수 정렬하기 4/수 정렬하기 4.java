import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    Integer[] arr = new Integer[n];

    for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

    Arrays.sort(arr, new Comparator<Integer>() {

      @Override
      public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
          return o2 - o1;
        } else {
          return o2 - o1;
        }
      }
    });

    for (int i = 0; i < n; i++) sb.append(arr[i]+ "\n");

    System.out.println(sb);
  }

}