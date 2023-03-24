import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] classes = br.readLine().split(" ");
    String[] oversees = br.readLine().split(" ");

    int b = Integer.parseInt(oversees[0]);
    int c = Integer.parseInt(oversees[1]);

    long total = 0;

    for (int i = 0; i < classes.length; i++) {
      int student = Integer.parseInt(classes[i]);

      if (student > b) {
        student = student - b;
        total = total + (student / c);

        if (student % c != 0) total++;
      }
    }

    total = total + classes.length;

    System.out.println(total);


  }

}