class Jz30 {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] >= 0){
                dp[i] = dp[i - 1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}