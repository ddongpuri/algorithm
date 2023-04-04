import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int location = 0;

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {

      int n = Integer.parseInt(br.readLine());

      location = 0;

      while (n != 0) {

        if ((n % 2) == 1) {
          sb.append(location + " ");
        }
        location++;
        n = n >> 1;
      }

    }

    System.out.println(sb);
  }

}