import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str;
    double total = 0;

    Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
    Map<String, Integer> map = new TreeMap<>(comparator);

    while ((str = br.readLine()) != null) {

      if (str.equals("")) break;

      total++;

      if (map.containsKey(str)) map.put(str, map.get(str) + 1);
      else map.put(str, 1);
    }

    Iterator<String> keys = map.keySet().iterator();

    while (keys.hasNext()) {
      String tree = keys.next();

      sb.append(tree).append(" ");
      sb.append(String.format("%.4f",(map.get(tree) / total) * 100));
      sb.append("\n");
    }

    System.out.println(sb);

  }
}