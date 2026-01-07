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
    long MOD = 1000000007L;
    long ans = 0;
    public long solve(TreeNode root, ArrayList<Long> value) {
        if (root == null) {
            return 0;
        }else{
            long l = solve(root.left, value);
            long r = solve(root.right, value);
            value.add(root.val+l+r);
            return root.val+l+r;
        }
    }

    public int maxProduct(TreeNode root) {
        ArrayList<Long> value = new ArrayList<>();
        
        solve(root, value);
        // System.out.println(value);
        
        for(long i : value){
            long m = i;
            long n = value.get(value.size()-1)-m;
            long an = m*n;
            if(an>ans){
                ans = an;
            }
        }
        return (int) (ans%MOD);
    }
}