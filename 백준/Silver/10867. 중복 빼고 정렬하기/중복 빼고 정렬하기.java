import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer stk = new StringTokenizer(br.readLine(), " ");


    int[] numbers = new int[n];

    ArrayList<Integer> list = new ArrayList<>(); 

    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(stk.nextToken());
    }

    for (int number : numbers) {
      if(!list.contains(number)) {
        list.add(number);
      }
    }

    list.sort(null);

    for (int num : list) {
      System.out.printf("%d ",num);
    }
    br.close();
  }
}