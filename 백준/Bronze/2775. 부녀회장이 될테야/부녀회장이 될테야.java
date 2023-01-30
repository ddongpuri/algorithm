import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    int[] stairs = new int[t];
    int[] location = new int[t];

    for (int i = 0; i < t; i++) {
      stairs[i] = sc.nextInt();
      location[i] = sc.nextInt();
    }

    int maxStair = -1;
    int maxLocation = -1;

    for (int i = 0; i < t; i++) {
      maxStair = Math.max(maxStair, stairs[i]);
      maxLocation = Math.max(maxLocation, location[i]);
    }

    int[][] apt = new int[maxStair+1][maxLocation+1];

    for (int i = 1; i < maxLocation+1; i++) apt[0][i] = i;

    for (int j = 1; j < maxStair+1; j++) {
      for (int k = 1; k < maxLocation+1; k++) {
        apt[j][k] = apt[j][k - 1] + apt[j-1][k];
      }
    }

    for (int i = 0; i < t; i++) {
      System.out.println(apt[stairs[i]][location[i]]);
    }
  }

}