import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {



  public static void main (String[] args) throws Exception {

    String name;
    int korean;
    int english;
    int math;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer stk;

    int N = Integer.parseInt(br.readLine());

    Student[] students = new Student[N];

    for (int i = 0;i < N; i++) { // 학생별 이름, 점수들로 Student 객체 생성하여 배열에 저장 
      stk = new StringTokenizer(br.readLine());

      name = stk.nextToken();
      korean = Integer.parseInt(stk.nextToken());
      english = Integer.parseInt(stk.nextToken());
      math = Integer.parseInt(stk.nextToken());

      students[i] = new Student(name, korean, english, math);
    }

    Arrays.sort(students, new Comparator<Student>() {

      @Override
      public int compare(Student o1, Student o2) {
        if (o1.korean < o2.korean) {
          return o2.korean - o1.korean;
        } else if (o1.korean == o2.korean) {
          if (o1.english > o2.english) {
            return o1.english - o2.english;
          } else if (o1.english == o2.english) {
            if (o1.math < o2.math) {
              return o2.math - o1.math;
            } else if (o1.math == o2.math) {
              return o1.name.compareTo(o2.name);
            }
          }
        }
        return -1;
      }
    });

    for (int i = 0; i < N; i++) {
      bw.write(students[i].name + '\n');
    }

    bw.flush();
    bw.close();
    br.close();
  }

}

class Student {
  String name;
  int korean;
  int english;
  int math;

  public Student(String name, int korean, int english, int math) {
    this.name = name;
    this.korean = korean;
    this.english = english;
    this.math = math;

  }
}