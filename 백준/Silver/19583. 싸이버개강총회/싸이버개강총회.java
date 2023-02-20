import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] times;
    String[] log;
    String str;
    int[] minutes = new int[3];
    Set<String> start = new HashSet<>();
    Set<String> attend = new HashSet<>();

    times = br.readLine().split(" ");

    for (int i = 0; i < 3; i++) minutes[i] = toMin(times[i]);

    while ((str = br.readLine()) != null) {
      log = str.split(" ");

      if (log.length == 1) {
        break;
      }

      int time = toMin(log[0]);

      if (time <= minutes[0]) {
        start.add(log[1]);

      } else if (time < minutes[1] || time > minutes[2]) {
        continue;

      } else {
        if (start.contains(log[1])) attend.add(log[1]);


      }
    }

    System.out.println(attend.size());

  }

  private static int toMin(String s) {

    return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3));
  }
}