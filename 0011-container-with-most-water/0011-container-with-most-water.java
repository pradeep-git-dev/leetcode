class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int area=0;
        int gap=height.length-1;
        int i=0,j=gap;
        while(i<=j){
            if(height[i]<height[j]){
                area=gap*height[i];
                i++;
                gap--;
            }
            else{
                area=gap*height[j];
                j--;
                gap--;
            }
            max = Math.max(max , area);
        }
        return max;
        
    }
}