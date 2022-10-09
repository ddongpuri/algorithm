import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N+1];
    int result;

    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i < N + 1; i++) {
      arr[i] = i * arr[i - 1];
    }

    result = arr[N] / (arr[K] * (arr[N-K]));

    sc.close();
    System.out.println(result);
  } // main 함수 끝 
}