import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 1. 계단의 개수를 입력받는다. 
    int n = Integer.valueOf(br.readLine()); // 6

    // 2. 각 계단에 적힌 숫자를 저장할 배열을 생성하고 값을 집어넣는다. 
    int[] steps = new int[n+1];
    for (int i = 1; i < steps.length; i++) steps[i] = Integer.valueOf(br.readLine());

    int[][] arr = new int[n+1][2];

    arr[1][0] = steps[1];

    for (int i = 2; i < arr.length; i++) {
      arr[i][0] = Math.max(arr[i-2][0], arr[i-2][1]) + steps[i];
      arr[i][1] = arr[i-1][0] + steps[i];
    }

    System.out.println(Math.max(arr[arr.length - 1][0], arr[arr.length - 1][1]));

  }
}