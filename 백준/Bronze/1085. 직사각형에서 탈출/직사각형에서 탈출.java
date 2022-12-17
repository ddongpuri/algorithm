import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt(); 
    int y = sc.nextInt(); 
    int w = sc.nextInt(); 
    int h = sc.nextInt();

    System.out.println(Math.min(Math.min(x, w - x), Math.min(y, h - y)));

  }
}