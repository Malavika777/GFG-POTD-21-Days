class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character,Integer> pc=new HashMap<>();
        for(char i:p.toCharArray()) 
            pc.put(i,pc.getOrDefault(i,0)+1);
        int start=0,match=0,ws=0;
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> win=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char r=s.charAt(end);
            win.put(r,win.getOrDefault(r,0)+1);
            if(pc.containsKey(r) && win.get(r)<=pc.get(r))
                match++;
            while(match==p.length()){
                if(min>end-start+1){
                    min=end-start+1;
                    ws=start;
                }
                char l=s.charAt(start++);
                if(pc.containsKey(l)&& win.get(l)==pc.get(l))
                    match--;
                win.put(l,win.get(l)-1);
            }
        }
        return min==Integer.MAX_VALUE?"-1":s.substring(ws,ws+min);
    }
}
