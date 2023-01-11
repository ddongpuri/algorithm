import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken());
    int m = Integer.parseInt(stk.nextToken());
    HashSet<String> neverSeen = new HashSet<>();
    HashSet<String> neverSeenHeard = new HashSet<>();
    String person;
    String[] names;
    int cnt = 0;

    for (int i = 0; i < n; i++) neverSeen.add(br.readLine());

    for (int i = 0; i < m; i++) {
      if (neverSeen.contains(person = br.readLine())) {
        neverSeenHeard.add(person);
      }
    }

    names = new String[neverSeenHeard.size()];
    int idx = 0;

    for (String name : neverSeenHeard) {
      names[idx] = name;
      idx++;
    }

    Arrays.sort(names, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        return o1.compareTo(o2);
      }
    });

    sb.append(names.length).append("\n");

    for (String name : names) sb.append(name).append("\n");

    System.out.println(sb);
  }
}