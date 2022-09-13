import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main (String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] heights = new int[10];
    int sum = 0;
    int out1 = 0;
    int out2 = 0;

    for (int i = 1 ; i <= 9; i++) {
      heights[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 1; i <= 9; i++) {
      sum += heights[i];
    }

    Arrays.sort(heights);

    for (int i = 1; i < 9; i++) {
      for (int j = i + 1; j <= 9; j++) {
        if ((sum - heights[i] - heights[j]) == 100) {
          out1 = i;
          out2 = j; 
        }
      }
    }

    heights[out1] = 0;
    heights[out2] = 0;

    for (int height : heights) {
      if (height != 0) {
        System.out.println(height);
      }
    }
    br.close();
  }
}