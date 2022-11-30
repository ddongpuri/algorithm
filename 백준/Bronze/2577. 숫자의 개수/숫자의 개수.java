import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[10];
    int a = 1;
    String s = null;

    for (int i = 0; i < 3; i++) {
      a *= sc.nextInt();
    }

    String str = String.valueOf(a);

    for (int i = 0; i < str.length(); i++) {

      s = "" + str.charAt(i);

      arr[Integer.valueOf(s)]++;
    }

    for (int num: arr) {
      bw.write(String.valueOf(num));
      bw.write('\n');
    }

    bw.flush();

  }
}