import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());

    Meeting[] meetings = new Meeting[N];
    int start;
    int end;
    int cnt = 0;

    for (int i = 0; i < N; i++) {
      stk = new StringTokenizer(br.readLine());

      start = Integer.parseInt(stk.nextToken());
      end = Integer.parseInt(stk.nextToken());

      meetings[i] = new Meeting(start, end);
    }

    Arrays.sort(meetings, new Comparator<Meeting>() {

      @Override
      public int compare(Meeting o1, Meeting o2) {
        if (o1.end == o2.end) {
          return o1.start - o2.start;
        }
        return o1.end - o2.end;}
    });

    cnt++;
    int currentend = meetings[0].end;

    for (int i = 1; i < N; i++) {
      if (meetings[i].start >= currentend) {
        cnt++;
        currentend = meetings[i].end;
      }
    }
        
    System.out.println(cnt);
  }

  public static class Meeting {

    int start;
    int end;

    public Meeting(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }
}