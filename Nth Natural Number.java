class Solution {
    long findNth(long n) {
        // code here
        long res=0,pv=1;
        while(n>0){
            res+=(n%9)*pv;
            n/=9;
            pv*=10;
        }
        return res;
    }
}
