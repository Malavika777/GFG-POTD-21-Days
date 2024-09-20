class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int c=1;
        int max=height[0];
        for(int i=1;i<height.length;i++){
            if(max<height[i]){
                c++;
                max=height[i];
            }
        }
        return c;
    }
}
