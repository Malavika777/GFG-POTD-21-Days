class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int c=0;
        for(int i:arr){
            c+=(i+k-1)/k;
        }    
        return c;
    }
}
