import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toUpperCase();
    int max = 0;
    int cnt = 0;
    int maxUsed = 0;

    int[] count = new int[26];

    for (int i = 0; i < str.length(); i ++) {
      count[str.charAt(i) - 65]++;
    }

    for (int i = 0; i < count.length; i ++) {
      if (max < count[i]) {
        maxUsed = i;
        max = count[i];
      }
    }

    for (int j = 0; j < count.length; j++) {
      if (count[j] == max) {
        cnt++;
      }
    }

    if (cnt > 1) {
      System.out.println("?");
    } else {
      System.out.println((char) (maxUsed + 65));
    }

    sc.close();
  }
}