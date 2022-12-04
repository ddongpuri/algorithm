import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;
    int age = 0;
    String name = null;
    int order = 0;
    List<User> userList = new ArrayList<>();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      stk = new StringTokenizer(br.readLine());

      age = Integer.parseInt(stk.nextToken());
      name = stk.nextToken();
      order = i;

      userList.add(new User(age, name, order));
    }

    userList.sort(new Comparator<User>() {

      @Override
      public int compare(User o1, User o2) {
        if(o1.age > o2.age) {
          return o1.age - o2.age;
        } else if (o1.age == o2.age) {
          if (o1.order > o2.order) {
            return o1.order - o2.order;
          }
        }
        return o1.age - o2.age;
      }});

    for (User user: userList) {
      bw.write(String.valueOf(user.age) + " ");
      bw.write(user.name + "\n");
    }

    bw.flush();
  }

  public static class User {
    private int age;
    private String name;
    private int order;

    User(int age, String name, int order) {
      this.age = age;
      this.name = name;
      this.order = order;

    }

  }


}