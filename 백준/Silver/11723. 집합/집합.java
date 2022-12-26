import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    HashSet<Integer> set = new HashSet<>();

    int m = sc.nextInt();
    String command = null;
    int x;

    for (int i = 0; i < m; i ++) {

      command = sc.next();

      switch (command) {

        case "add":
          set.add(sc.nextInt());
          break;

        case "remove":
          set.remove(sc.nextInt());
          break;

        case "check":
          bw.append(String.valueOf(x = set.contains(sc.nextInt()) ? 1 : 0)).append("\n");
          break;    

        case "toggle":
          x = sc.nextInt();
          if (set.contains(x)) set.remove(x);
          else set.add(x);
          break;    

        case "all":
          set.clear();
          for (int j = 1; j <= 20; j++) set.add(j);
          break;  

        case "empty":
          set.clear();
          break;
      }
    }

    bw.flush();
  }
}