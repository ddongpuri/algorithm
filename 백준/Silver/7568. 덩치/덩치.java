import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static class Person {

    int weight;
    int tall;

    Person(int weight, int tall) {
      this.weight = weight;
      this.tall = tall;
    }    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk;

    int weight;
    int tall;
    int rank = 1;

    int N = Integer.parseInt(br.readLine());

    Person[] persons = new Person[N];

    for (int i = 0; i < N; i++) {
      stk = new StringTokenizer(br.readLine());
      weight = Integer.parseInt(stk.nextToken());
      tall = Integer.parseInt(stk.nextToken());

      persons[i] = new Person(weight, tall);
    }

    for (int j = 0; j < N; j++) {
      rank = 1;
      for (int k = 0; k < N; k++) {
        if ((persons[j].weight < persons[k].weight) && (persons[j].tall < persons[k].tall)) {
          rank++;
        }
      }
      sb.append(rank);

      if (j != N -1) {
        sb.append(' ');
      }
    }

    System.out.println(sb.toString());

  }

}