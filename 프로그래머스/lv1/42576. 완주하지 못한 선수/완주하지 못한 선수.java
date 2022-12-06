
import java.util.Arrays;

public class Solution {
  public static String solution(String[] participant, String[] completion) {
    String answer = "";

    Arrays.sort(participant);
    Arrays.sort(completion);

    for (int i = 0; i < participant.length; i++) {

      if (i == participant.length - 1) {
        answer = participant[participant.length - 1];
        break;
      }

      if (!participant[i].equals(completion[i])) {
        answer = participant[i];
        break;
      }
    }

    return answer;
  }
}
