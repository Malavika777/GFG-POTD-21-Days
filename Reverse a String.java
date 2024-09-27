class Reverse {
    // Complete the function
    // str: input string
    public static String reverseString(String s) {
        // Reverse the string str
        char[] res=s.toCharArray();
        int left=0,right=res.length-1;
        while(left<right){
            char temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }
        return new String(res);
    }
}
