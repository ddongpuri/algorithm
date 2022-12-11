import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = sc.nextInt();
    Coordi[] arr = new Coordi[N];

    for (int i = 0; i < N; i++) {
      arr[i] = new Coordi(sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(arr, new Comparator<Coordi>() {

      @Override
      public int compare(Coordi o1, Coordi o2) {
        if (o1.x == o2.x) {
          return o1.y - o2.y;
        } else {
          return o1.x - o2.x;
        }
      }

    });

    for (int i = 0; i < N; i++) {
      bw.append(arr[i].x + " " + arr[i].y).append("\n");
    }

    bw.flush();

  }

  static class Coordi {
    private int x;
    private int y;

    public Coordi(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

}