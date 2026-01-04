import java.util.*;
class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num:nums){
            int p = 0;
            ArrayList<Integer> ele = new ArrayList<>();
            for(int i = 1; i<=num;i++){
                if(num%i==0){
                    p++;
                    ele.add(i);
                }else if(p>4){
                    break;
                }
            }
            if(p==4){
                for(int j = 0; j<4; j++){
                    ans += ele.get(j);
                }
            }
        }

        return ans;
    }
}