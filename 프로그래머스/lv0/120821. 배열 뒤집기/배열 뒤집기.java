class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[len - 1 - i] = num_list[i];
        }
        
        return answer;
    }
}