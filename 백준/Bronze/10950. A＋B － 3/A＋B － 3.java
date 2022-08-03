import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n * 2];

    for(int i = 0; i < n * 2; i++) {
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i < n * 2 - 1;i += 2) { 
      System.out.println(arr[i] + arr[i + 1]);  
    }

    sc.close();
  }
}
