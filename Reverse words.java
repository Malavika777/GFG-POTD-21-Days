class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        Stack<String>s=new Stack<>();
        String[] st=str.split("\\.");
        for(String s1:st){
            s.push(s1);
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
            if(!s.isEmpty()){
                sb.append(".");
            }
        }
        return sb.toString();
        
    }
}
