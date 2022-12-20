class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
       int[] arr = new int[201];
            int start;
    int end;

    for (int i = 0; i < lines.length; i++) {
      lines[i][0] += 100;
      lines[i][1] += 100;
    }

    for (int j = 0; j < lines.length; j++) {
      start = lines[j][0];
      end = lines[j][1];

      for (int k = start; k < end; k++) {
        arr[k] ++;
      }
    }

    for (int num : arr) {
      if (num > 1) {
        answer++;
      }
    }

    return answer;

    }
}