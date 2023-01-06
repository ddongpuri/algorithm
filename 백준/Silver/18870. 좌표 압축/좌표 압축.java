import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;

    HashSet<Integer> set = new HashSet<>();

    int n = Integer.parseInt(br.readLine());

    int[] order = new int[n];
    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++)
      order[i] = Integer.parseInt(stk.nextToken());

    for (int i : order) {
      set.add(i);
    }


    int[] arr = new int[set.size()];

    int idx = 0;

    for (int i : set) {
      arr[idx] = i;
      idx++;
    }

    Arrays.sort(arr);

    for (int i = 0; i < n; i++) {
      sb.append(Arrays.binarySearch(arr, order[i])).append(" ");
    }

    System.out.println(sb);

  }
}