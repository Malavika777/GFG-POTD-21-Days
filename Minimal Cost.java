class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int[] dp=new int[arr.length];
        dp[0]=0;
        for(int i=1;i<arr.length;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=Math.max(0,i-k);j<i;j++){
                dp[i]=Math.min(dp[i],dp[j]+Math.abs(arr[i]-arr[j]));
            }
        }
        return dp[arr.length-1];
    }
}
