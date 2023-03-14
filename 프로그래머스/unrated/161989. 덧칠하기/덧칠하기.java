import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
     int answer = 0;
    int cnt = 0;
    int chk = 0;

    if (section.length == 1) return 1;

    while (true) {
      cnt = cnt + 1;
      System.out.println(section[chk] + m -1);
      chk = Arrays.binarySearch(section, section[chk] + m - 1);

      if (chk == section.length - 1 || chk == (section.length + 1) * -1) {
        return cnt;
      }

      if (chk < 0) {
        chk = (chk + 1) * -1;
      } else {
        chk++;
      }
    }
    }
}