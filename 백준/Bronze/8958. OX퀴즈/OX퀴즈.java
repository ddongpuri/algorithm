import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // 앵무새 

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); 
    String str;
    int score = 0;
    int totalScore = 0;

    for (int i = 0; i < N; i++) {
      str = br.readLine();

      for (int k = 0; k < str.length(); k++) {
        if (str.charAt(k) == 'O') {
          score+=1;
          totalScore += score;
        } else {
          score = 0;
        }
      }
      System.out.println(totalScore);
      score = 0;
      totalScore = 0;
    }   

  }
}