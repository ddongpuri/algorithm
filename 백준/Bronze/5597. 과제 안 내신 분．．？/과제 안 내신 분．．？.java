import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean[] arr = new boolean[31];

    for (int i = 1; i < 29; i++) arr[sc.nextInt()] =  true;

    for (int i = 1; i <= 30; i++) if (!arr[i]) System.out.println(i);

    sc.close();

  }
}