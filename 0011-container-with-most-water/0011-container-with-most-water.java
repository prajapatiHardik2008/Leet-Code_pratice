class Solution {
    public int maxArea(int[] height) {
        int l = 0 , r  = height.length - 1;
        int w = 0 , h ; // w stand for width and h stand for height 
        int area = 0;
        
        while(l < r)
        {
            w = r - l;
            h = Math.min(height[l],height[r]);
            if(h * w > area)
            {
                area = h * w;
            }

            if(height[l] < height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }

        return area;
    }
}