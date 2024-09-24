class Solution {
    int lps(String str) {
        // code here
        int n=str.length();
        int[] lps=new int[n];
        int len=0,i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps[n-1];
    }
