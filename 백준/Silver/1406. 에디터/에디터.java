import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();  

    String str = br.readLine();

    LinkedList<Character> front = new LinkedList<>();
    LinkedList<Character> back = new LinkedList<>();

    for (int i = 0; i < str.length(); i++) {
      front.add(str.charAt(i));
    }

    int m = Integer.parseInt(br.readLine());

    for (int i = 0; i < m; i++) {
      String command = br.readLine();
      char c = command.charAt(0);

      if (c == 'L' && !front.isEmpty()) {
        back.addFirst(front.pollLast());
      } else if (c == 'D' && !back.isEmpty()) {
        front.addLast(back.pollFirst());
      } else if (c == 'B' && !front.isEmpty()) {
        front.pollLast();
      } else if (c == 'P'){
        front.addLast(command.charAt(2));
      }
    }

    while (!front.isEmpty()) {
      sb.append(front.pollFirst());
    }

    while (!back.isEmpty()) {
      sb.append(back.pollFirst());
    }

    System.out.println(sb);



  }
}