import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str;
    int len;

    while(!(str = br.readLine()).equals("0")) {

      len = str.length();

      if (len == 1) {
        bw.append("yes" + "\n");
        continue;
      }

      for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - 1 - i)) {
          bw.append("no" + "\n");
          break;
        }

        if (i == len / 2 - 1) {
          bw.append("yes" + "\n");
        }
      }
    }

    bw.flush();

  }
}