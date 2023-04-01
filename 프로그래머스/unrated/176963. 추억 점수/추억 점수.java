import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
    
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);
    
        int score;

        for (int i = 0; i < photo.length; i++) {
          score = 0;
          for (int j = 0; j < photo[i].length; j++) {
            System.out.println(photo[i][j]);
            score += map.getOrDefault(photo[i][j], 0);
          }
          answer[i] = score;
        }

        return answer;
    }
}