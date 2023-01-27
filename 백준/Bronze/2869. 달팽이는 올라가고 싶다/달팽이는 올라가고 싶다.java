import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(stk.nextToken()); // 올라갈수 있음 
    int b = Integer.parseInt(stk.nextToken()); // 미끄러짐 
    int v = Integer.parseInt(stk.nextToken()); // 나무 막대 길이 

    int day = (v - b) / (a - b);
    if ((v - b) % (a - b) != 0) day++;
    System.out.println(day);

  }
}