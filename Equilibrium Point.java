class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        long leftSum=0;
        long totSum=0;
        for(long i:arr){
            totSum+=i;
        }
        for(int i=0;i<arr.length;i++){
            if(leftSum==totSum-arr[i]-leftSum){
                return i+1;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
