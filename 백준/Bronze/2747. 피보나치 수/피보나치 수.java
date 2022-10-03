import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] fiboNums = new int[N+1];
        
        fiboNums[0] = 0;
        fiboNums[1] = 1;
        
        for (int i = 2; i < N + 1; i++) {
            fiboNums[i] = fiboNums[i - 1] +  fiboNums[i - 2];
        }
        
        System.out.println(fiboNums[N]);
    }
}