/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void solve(TreeNode root, List<Integer> lol, int idx){      
        if(root == null){
            return;
        }
        // System.out.println(idx);
        if(lol.size()>=idx+1){
            lol.set(idx, lol.get(idx)+root.val);
        }else{
            lol.add(root.val);
        }
        // System.out.println(lol);
        solve(root.left, lol, idx+1);
        solve(root.right, lol, idx+1);

        
    }

    public int maxLevelSum(TreeNode root) {
        List<Integer> lol = new ArrayList<>();
        
        solve(root, lol, 0);
        int an = Integer.MIN_VALUE, ans = 1;int j = 1;
        for(int i : lol){
            if(an<i){
                an = i;
                ans = j;
            }
            j++;
        }
        return ans;
    }
}