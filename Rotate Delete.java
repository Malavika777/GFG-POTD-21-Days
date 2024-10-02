class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        int k=1;
        while(n>1){
            int last=arr.remove(arr.size()-1);
            arr.add(0,last);
            int del=n-k;
            if(del<0){
                del=0;
            }
            arr.remove(del);
            n--;
            k++;
        }
        return arr.get(0);
    }
}
