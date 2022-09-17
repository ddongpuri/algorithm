import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] sides = new int[N];
    int sum = 0;

    for (int i = 0; i < N; i++) {
      sides[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(sides);

    for (int i = sides.length - 1; i >= 2; i--) {
      if (sides[i] < sides[i-1] + sides[i-2]) {
        sum = sides[i] + sides[i -1] + sides[i - 2];
        break;
      }
      if (i == 2) {
        sum = -1;
      }
    }

    System.out.println(sum);
    br.close();
  }
}