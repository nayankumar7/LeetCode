class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum += n;
        }
        int len = nums.length;int ans = 0;int count = 0;

        for(int i = 0; i<len-1;i++){
            sum -= nums[i];
            count += nums[i];
            int p = count - sum;
            // System.out.println(p+" "+ sum+" "+ count);
            if(p%2==0)ans++;
        }
        return ans;
    }
}