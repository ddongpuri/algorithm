import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        
        System.out.println(sb);
    }
}