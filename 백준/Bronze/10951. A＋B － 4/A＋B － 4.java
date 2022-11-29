import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    int sum = 0;
    String str;

    while((str = br.readLine()) != null) {
      stk = new StringTokenizer(str);

      sum += Integer.parseInt(stk.nextToken());
      sum += Integer.parseInt(stk.nextToken());

      System.out.println(sum);

      sum = 0;
    }

  }
}