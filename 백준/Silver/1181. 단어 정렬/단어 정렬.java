import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine()); 

    String[] words = new String[n]; // 입력한 단어를 저장할 String 배열 생성 

    for (int i = 0; i < n; i++) { // 입력받은 단어 한 줄씩 저장
      words[i] = br.readLine();
    }

    Arrays.sort(words, new Comparator<String>() {

      @Override
      public int compare(String w1, String w2) {
        if (w1.length() == w2.length()) { // 두 단어의 길이가 같을 경우 
          return w1.compareTo(w2); // 사전 순으로 정렬한다. 
        }

        else { // 단어의 길이가 같은 경우가 아니면, 
          return w1.length() - w2.length();
        }
      }
    });

    sb.append(words[0]).append('\n'); // 정렬 후, 처음에 온 단어는 우선 StringBuilder에 append 

    for (int i = 1; i < n; i++) { // 중복되는 단어를 출력하지 않기 위해 단어를 비교 
      if (!words[i].equals(words[i -1])) {
        sb.append(words[i]).append('\n');
      }
    }

    System.out.println(sb);
    br.close();
  }
}