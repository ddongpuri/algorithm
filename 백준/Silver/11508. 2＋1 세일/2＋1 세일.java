import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int minPrice = 0;

    int[] prices = new int[N];

    for (int i = 0; i < N; i++) {
      prices[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(prices);


    for (int price : prices) {
      minPrice += price;
    }

    for (int i = N - 3; i >=0; i-=3) {
      minPrice -= prices[i];
    }

    System.out.println(minPrice);

  }
}