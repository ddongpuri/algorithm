import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();  

    int n = Integer.parseInt(br.readLine());

    LinkedList<Character> front = new LinkedList<>();
    LinkedList<Character> back = new LinkedList<>();

    for (int i = 0; i < n; i++) {

      String str = br.readLine();

      for (int j = 0; j < str.length(); j++) {
        char c = str.charAt(j);

        if (c == '<') {
          if (!front.isEmpty()) back.addFirst(front.pollLast());

        } else if (c == '>') {
          if (!back.isEmpty()) front.addLast(back.pollFirst());

        } else if (c == '-') {
          if(!front.isEmpty()) front.pollLast();

        } else {
          front.addLast(c);
        }
      }

      while (!front.isEmpty()) sb.append(front.pollFirst());
      while (!back.isEmpty()) sb.append(back.pollFirst());

      sb.append("\n");

      front.clear();
      back.clear();
    }

    System.out.println(sb);


  }
}