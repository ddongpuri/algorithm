import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] heights = new int[10]; // 9 난쟁이의 키를 담을 int형 배열 준비 
    int sum = 0; // 9 난쟁이의 키의 합 
    int tmp = 0;
    int out1 = 0; // 7난쟁이에서 제외될 난쟁이의 인덱스값을 저장할 변수 1
    int out2 = 0; // 7난쟁이에서 제외될 난쟁이의 인덱스값을 저장할 변수 2

    for (int i = 1; i <= 9; i++) { // 9 난쟁이의 키를 배열에 담는다. 
      heights[i] = sc.nextInt();
      sum += heights[i];
    }


    for (int i = 1; i <= 8; i++) { // 난쟁이 키 오름차순으로 정렬하기 
      for (int j = i + 1; j <=9; j++) {
        if (heights[i] >= heights[j]) {
          tmp = heights[j];
          heights[j] = heights[i];
          heights[i] = tmp;
        }
      }
    }


    for (int j = 1; j <= 8; j++) { // 9난쟁이 키의 총합에서 두 개를 뺏을 때 100 되는 배열 요소 구하기 
      for (int k = j + 1; k <= 9; k++) {
        if ((sum - heights[j] - heights[k]) == 100) {

          out1 = j;
          out2 = k;
        }
      }
    }

    heights[out1] = 0;
    heights[out2] = 0;

    for (int i = 1; i <=9;i++) {
      if (heights[i] != 0) {
        System.out.println(heights[i]);
      }
    }

    sc.close();
  }
}