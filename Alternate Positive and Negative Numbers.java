class Solution {
    void rearrange(ArrayList<Integer> arr) {
        List<Integer>p=new ArrayList<>();
        List<Integer>n=new ArrayList<>();
        for(int i:arr){
            if(i>=0){
                p.add(i);
            }
            else{
                n.add(i);
            }
        }
        int i=0,j=0,k=0;
        while(i<p.size()&& j<n.size()){
            arr.set(k++,p.get(i++));
            arr.set(k++,n.get(j++));
        }
        while(i<p.size()){
            arr.set(k++,p.get(i++));
        }
        while(j<n.size()){
            arr.set(k++,n.get(j++));
        }
    }
}
