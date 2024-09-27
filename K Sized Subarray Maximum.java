class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> res=new ArrayList<>();
        int idx=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            if(idx<i){
                max=arr[i];
                idx=i;
                for(int j=i+1;j<i+k;j++){
                    if(arr[j]>max){
                        max=arr[j];
                        idx=j;
                    }
                }
            }else{
                if(arr[i+k-1]>max){
                    max=arr[i+k-1];
                    idx=i+k-1;
                }
            }
            res.add(max);
        }
        return res;
    }
}
