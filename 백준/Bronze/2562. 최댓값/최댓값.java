import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];
    int indexOfMax = 0; // 가장 큰 수의 인덱스 
    int max = 0; // 가장 큰 수

    for (int i = 1; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());

      if (max < arr[i]) {
        max = arr[i];
        indexOfMax = i;
      }

    }

    System.out.println(max);
    System.out.println(indexOfMax);

  }
}