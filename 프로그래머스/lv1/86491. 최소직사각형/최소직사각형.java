class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int tmp; // 값의 자리를 바꿀 때 사용할 임시변수
        int w = 0; // 지갑의 가로길이
        int h = 0; // 지갑의 세로길이
        
        // 1. 명함의 가로세로 길이 중 더 큰 것이 뒤로 오게끔 만든다. 
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        // 2. 앞자리[0], 뒷자리[1] 수들의 최대값을 각 각 구한다.
        for (int i = 0; i < sizes.length; i++) {
            if (w < sizes[i][0]) w = sizes[i][0];
            if (h < sizes[i][1]) h = sizes[i][1];
        }
        
        answer = w * h;
        
        return answer;
    }
}