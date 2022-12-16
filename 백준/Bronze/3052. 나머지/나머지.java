import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < 10; i++) {
      map.put(Integer.parseInt(br.readLine()) % 42, 1);
    }

    System.out.println(map.size());

  }
}