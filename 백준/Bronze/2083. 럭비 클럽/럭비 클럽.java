import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    String str;
    String[] human;
    String name;
    int age;
    int weight;

    while(!(str = sc.nextLine()).equals("# 0 0")) {
      human = str.split(" ");
      if (Integer.parseInt(human[1]) > 17 || Integer.parseInt(human[2])>= 80) System.out.println(human[0] + " Senior");
      else System.out.println(human[0] + " Junior");
    }

  }
}