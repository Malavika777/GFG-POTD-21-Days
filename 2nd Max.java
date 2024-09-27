class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max){
                secMax=max;
                max=n;
            }
            else if(n>secMax && n<max){
                secMax=n;
            }
        }
        return secMax==Integer.MIN_VALUE?-1:secMax;
    }
}
