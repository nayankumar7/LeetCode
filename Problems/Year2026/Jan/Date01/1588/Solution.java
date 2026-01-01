class Solution {
    public int solve(int[] nums, int n, int idx, int ans){
        if(idx >= n){
            return ans;
        }
        for(int i = 0; i<n; i++){
            int j = 0;
            for(; j <idx+1; j++){
                if(j+i==n){
                    break;
                }
                ans += nums[j+i];
                // System.out.println(ans);
            }
            if(j+i==n)break;
        }
        return solve(nums, n, idx+2, ans);
    }
    public int sumOddLengthSubarrays(int[] arr) {
        return solve(arr, arr.length, 0, 0);
    }
}