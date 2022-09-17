import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());
    int[] wid = new int[] {1, Integer.parseInt(stk.nextToken())};
    int[] len = new int[] {0, Integer.parseInt(stk.nextToken())};

    int N = Integer.parseInt(br.readLine());

    int[][] cuts = new int[N + 4][2];

    for (int i = 0; i < N; i++) {
      stk = new StringTokenizer(br.readLine());
      cuts[i][0] = Integer.parseInt(stk.nextToken());
      cuts[i][1] = Integer.parseInt(stk.nextToken());
    }
    cuts[N] = wid;
    cuts[N+1] = len;
    cuts[N + 2] = new int[] {0,0};
    cuts[N + 3] = new int[] {1,0};

    Arrays.sort(cuts, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] != o2[0] ? o1[0]-o2[0] : o2[1]-o1[1];
      }
    });

    int widmax = 1;
    int lenmax = 1;

    for (int i = 0; i < cuts.length - 1; i++) {
      if (cuts[i][0] == 0) {
        if ((cuts[i][1] - cuts[i+1][1]) > widmax) {
          widmax = cuts[i][1] - cuts[i+1][1];
        }
      } else {
        if ((cuts[i][1] - cuts[i+1][1]) > lenmax) {
          lenmax = cuts[i][1] - cuts[i+1][1];
        }
      }
    }

    System.out.println(widmax * lenmax);
  }
}