import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] numbers = new int[n];

    for (int i = 0; i < n; i ++) {
      numbers[i] = Integer.parseInt(br.readLine());

    }

    Arrays.sort(numbers);

    for (int number : numbers) {
      bw.write(String.valueOf(number));
      bw.write("\n");
    }

    bw.flush();

    bw.close();
    br.close();
  }
}