class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                if(s.isEmpty()) return false;
                if((ch==')' && s.peek()=='(') || (ch==']' && s.peek()=='[') || (ch=='}' && s.peek()=='{')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        return s.isEmpty();
    }
}
