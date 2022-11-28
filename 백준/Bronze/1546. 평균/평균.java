import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;
    double max = 0;
    double totalScore = 0;

    int count = Integer.parseInt(br.readLine());
    int[] scores = new int[count];

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < scores.length; i++) {
      scores[i] = Integer.parseInt(stk.nextToken());
    }

    Arrays.sort(scores);

    max = scores[scores.length - 1];

    for (int score : scores) {
      totalScore += (score / max) * 100;
    }

    System.out.println(totalScore / scores.length);
  }
}