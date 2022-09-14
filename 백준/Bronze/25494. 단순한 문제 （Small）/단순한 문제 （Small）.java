import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
    StringTokenizer stk;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[3];
    int cnt = 0;

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      stk = new StringTokenizer(br.readLine()," ");

      for (int j = 0; j < 3; j++) {
        arr[j] = Integer.parseInt(stk.nextToken());
      }

      // 삼중 for 문
      for (int a = 1; a <= arr[0]; a++) {
        for (int b = 1; b <= arr[1]; b++) {
          for (int c = 1; c <= arr[2]; c++) {
            if ((a % b) == (b % c)) {
              if ((b % c) == (c % a)) {
                cnt++;
              }
            }
          }
        }
      }

      bw.write(String.valueOf(cnt));  
      bw.write("\n");
      cnt = 0;
    }

    bw.flush();

    br.close();
    bw.close();    
  }
}