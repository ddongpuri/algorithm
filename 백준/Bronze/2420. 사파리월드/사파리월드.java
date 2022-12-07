import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner sc = new Scanner(System.in);
      
    long a = sc.nextLong();
    long b = sc.nextLong();  
    
    System.out.println(Math.abs(a - b));

    sc.close();
  }
}