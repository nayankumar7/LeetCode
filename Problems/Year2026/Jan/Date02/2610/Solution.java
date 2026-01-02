import java.util.*;

class Solution {
    public List<List<Integer>> solve (List<List<Integer>> ans, ArrayList<Integer> r){
        if(r.size()==0){
            return ans;
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> rr = new ArrayList<>();
        for(int num:r){
            if(a.contains(num)){
                rr.add(num);
            }
            else{
                a.add(num);
            }
        }
        ans.add(a);
        return solve(ans, rr);
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();

        for(int num:nums){
            if(a.contains(num)){
                r.add(num);
            }
            else{
                a.add(num);
            }
        }
        ans.add(a);
        if(r.size()==0){
            return ans;
        }
        return solve(ans, r);
    }
}