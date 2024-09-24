class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int[] res=new int[2];
        for(int i=1;i<=arr.length;i++){
            if(!m.containsKey(i)){a
                res[1]=i;
                break;
            }
        }
        for(int i:m.keySet()){
            if(m.get(i)==2){
                res[0]=i;
                break;
            }
        }
        return res;
    }
