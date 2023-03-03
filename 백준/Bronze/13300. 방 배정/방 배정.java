import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int cnt = 0;

    int [][] arr = new int[6][2];

    for (int i = 0; i < n; i++) {
      int sex = sc.nextInt();
      int grade = sc.nextInt();

      arr[grade - 1][sex]++;
    }

    for (int i = 0; i < arr.length; i++) {
      cnt += (arr[i][0] / k);
      cnt += (arr[i][1] / k);

      if (arr[i][0] % k != 0) cnt++;
      if (arr[i][1] % k != 0) cnt++;
    }

    System.out.println(cnt);


  }
}