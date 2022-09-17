import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    int n = Integer.parseInt(br.readLine());

    int[][] arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      stk = new StringTokenizer(br.readLine());
      for (int j = 0; j < 2; j++) {
        arr [i][j] = Integer.parseInt(stk.nextToken());
      }
    }

    Arrays.sort(arr, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[1] != o2[1] ? o1[1]-o2[1] : o1[0]-o2[0]; 
      }
    });

    for (int i = 0; i < n; i++) {      
      bw.write(arr[i][0] + " " + arr[i][1] + "\n");
    }

    bw.flush();
    br.close();
  }
}