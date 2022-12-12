import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int [][] arr = new int[41][2];
    int idx;

    arr[0] = new int[] {1, 0};
    arr[1] = new int[] {0, 1};

    for (int i = 2; i < arr.length; i++) {
      arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
      arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
    }

    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) {
      idx = Integer.parseInt(br.readLine());

      bw.append(arr[idx][0] + " " + arr[idx][1]).append("\n");
    }

    bw.flush();

  }

}