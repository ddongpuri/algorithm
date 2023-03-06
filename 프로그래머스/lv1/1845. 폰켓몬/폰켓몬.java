import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int take = nums.length / 2;
                
        for (int i = 0; i < nums.length; i++) {
        
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        
        if (take <= map.size()) {
            return take;
        } else {
            return map.size();
        }
        
    }
}