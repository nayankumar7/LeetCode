import java.util.ArrayList;
class Solution {
    public int repeatedNTimes(int[] nums) {
        int max = nums[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int n: nums){
            if(ans.contains(n)){
                return n;
            }else{
                ans.add(n);
            }
        }
        return max;
    }
}