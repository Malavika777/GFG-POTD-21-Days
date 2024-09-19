class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int a[]) {
        int c=1;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(a[i]==c){
                c++;
            }
            else{
                //System.out.println(c);
                break;
            }
        }
        return c;
    }
}
