class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        int n=nums.size()/3;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Integer>res=new ArrayList<>();
        for(int i:m.keySet()){
            if(m.get(i)>n){
                res.add(i);
            }
        }
        return res.size()!=0?res:Arrays.asList(-1);
    }
}
