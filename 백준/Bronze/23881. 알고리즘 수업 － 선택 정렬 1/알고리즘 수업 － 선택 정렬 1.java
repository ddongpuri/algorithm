import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken());
    int k = Integer.parseInt(stk.nextToken());
    int [] arr = new int[n];
    int index;
    int max;
    int temp;
    int cnt = 0;

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }

    for (int i = n - 1; i >= 1; i--) {
      max = arr[0];
      index = 0;
      for (int j = 1; j <= i; j++) {
        if (max < arr[j]) {
          max = arr[j];
          index = j;
        }
      }

      if (index != i) {
        temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
        cnt++;
      }

      if (cnt == k) {
        System.out.println(arr[index] + " " + arr[i]);
        return;
      }

    }

    System.out.println(-1);

  }
}