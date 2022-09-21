import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
  // 수현이 기술 
  //
  // 제일 위의 카드 1장을 바닥에 내려놓는다.
  // 위에서 두 번째 카드를 바닥에 내려놓는다. 카드가 2장 이상일 때만 쓸 수 있다.
  // 제일 밑에 있는 카드를 바닥에 내려놓는다. 카드가 2장 이상일 때만 쓸 수 있다.
  // 1. pollFirst
  // 2. (size >= 2)
  //    temp = pollFirst, pollFirst, addFirst(temp) 
  // 3. (size >= 2)
  //    pollLast

  static Stack<Integer> stack = new Stack<>(); // 내려놓아진 카드 결과물 
  static Deque<Integer> dq = new LinkedList<>(); // 수현이가 가진 카드 
  static int temp;

  public static void main (String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine()); // 읽어들일 숫자의 개수 N 

    int [] arr = new int[N]; // 수현이 쓴 기술을 순서대로 담을 배열 

    stk = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(stk.nextToken());
    }    

    for (int i = N; i > 0; i--) { // 바닥에 내려놓은 카드 더미 stack 
      stack.push(i);
    }

    for (int i = N - 1; i >= 0; i--) {
      if (arr[i] == 1) {
        skillOne();
      } else if (arr[i] == 2) {
        skillTwo();
      } else {
        skillThree();
      }
    }

    while(!dq.isEmpty()) {
      bw.write(String.valueOf(dq.pollFirst()));
      bw.write(' ');
    }

    bw.flush();
  }

  static void skillOne() { // 수현이가 사용하는 1번 기술 
    dq.addFirst(stack.pop());
  }

  static void skillTwo() { // 수현이가 사용하는 2번 기술 
    if (dq.size() >= 1) {
      temp = dq.pollFirst(); // dq 처음것 잠시 임시보관 
      dq.addFirst(stack.pop()); // stack에서 꺼내서 dq 
      dq.addFirst(temp); //
    }
  }

  static void skillThree() { // 수현이가 사용하는 3번 기술
    if (dq.size() >= 1) {
      dq.addLast(stack.pop());
    }
  }
}