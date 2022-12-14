import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[11];

    arr[0] = 1; // 1을 1, 2, 3으로 만들 수 있는 가지 수
    arr[1] = 2; // 2를 1, 2, 3으로 만들 수 있는 가지 수
    arr[2] = 4; // 3을 1, 2, 3으로 만들 수 있는 가지 수 

    for (int i = 3; i < arr.length; i++) {
      arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
    }

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      bw.append("" + arr[Integer.parseInt(br.readLine()) - 1]).append("\n");
    }

    br.close();
    bw.flush();
    bw.close();

  }

}