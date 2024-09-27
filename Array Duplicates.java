class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i:m.keySet()){
            if(m.get(i)>1){
                res.add(i);
            }
        }
        if(res.size()==0){
            return new ArrayList<>(Collections.singletonList(-1));
        }else{
            Collections.sort(res);
            return res;
        }
    }
}
