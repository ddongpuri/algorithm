import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n]; //8
    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    int k = Integer.parseInt(br.readLine()); // 2


    int member = arr.length / 2; // 4

    while (member >= k) { 
      int interval = arr.length / member;

      for (int i = 0; i < arr.length; i = i + interval) {
        Arrays.parallelSort(arr, i, i + interval);
      }

      member = member >> 1;
    }


    for (int a : arr) {
      sb.append(a).append(" ");
    }

    System.out.println(sb);


  }
}