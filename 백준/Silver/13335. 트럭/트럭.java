import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  // 다리에 트럭이 진입할 자리가 있는지
  // 다리에 하중이 여유가 있는지? 

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stk;

    stk = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(stk.nextToken()); // 다리를 건너는 트럭의 수 
    int w = Integer.parseInt(stk.nextToken()); // 다리의 길이 
    int L = Integer.parseInt(stk.nextToken()); // 다리의 최대하중 
    int totalWeight = 0; // 현재 다리의 하중 
    int totalTime = 0;

    Queue<Integer> bridge = new LinkedList<>();
    Queue<Integer> ready = new LinkedList<>();

    stk = new StringTokenizer(br.readLine()); 

    for (int i = 0; i < n; i++) {
      ready.add(Integer.parseInt(stk.nextToken()));
    }

    int truckIn = 0;
    int truckOut = 0;

    truckIn = ready.poll();
    bridge.add(truckIn);
    totalWeight += truckIn;
    totalTime++;

    while (totalWeight != 0) {

      if (ready.isEmpty()) {
        truckIn = 0;
      } else {
        truckIn = ready.peek(); // 대기열의 첫번째 트럭의 하중값을 truckIn에 담는다. 
      }

      if (bridge.size() < w) { // 트럭이 더 들어갈 수 있으면 

        if (totalWeight + truckIn <= L) { // 다음 트럭이 최대하중을 넘지 않는지 체크하고 
          bridge.add(truckIn); // 다리에 트럭을 올려주고 
          totalWeight += truckIn; // 전체 무게에 트럭 무게를 더해준다.
          totalTime++; // 트럭하나 갔으니까 시간도 1 더해줌

          ready.poll(); // 대기열에서 꺼냄

        } else {
          bridge.add(0);
          totalTime++;
        }

      } else { // 자리가 없는 경우 
        truckOut = bridge.peek();

        totalWeight -= truckOut;
        bridge.poll(); //
        totalTime++;

        if (totalWeight + truckIn <= L) {
          bridge.add(truckIn); // 다리에 트럭을 올려주고 
          totalWeight += truckIn; // 전체 무게에 트럭 무게를 더해준다.

          ready.poll(); // 대기열에서 꺼냄

        } else {
          bridge.add(0);
        }
      }
    }

    System.out.println(totalTime);
  }

}