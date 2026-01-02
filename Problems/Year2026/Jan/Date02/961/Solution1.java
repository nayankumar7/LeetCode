import java.util.HashMap;
import java.util.Map;
class Solution1 {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // System.out.println(map);
        int max = nums[0];
        int re = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (re < e.getValue()) {
                max = e.getKey();
                re = e.getValue();
            }
        }
        return max;
    }
}