class Solution {
    public int maxProduct(int[] nums) {
        int fMax = 0;
        int sMax = 0; 
        for(int ele : nums)
        {
            if(ele -1 > fMax)
            {
                sMax = fMax;
                fMax = ele - 1;
            }
            else if(ele -1 > sMax)
            {
                sMax = ele -1 ;
            }
        }
    return fMax * sMax;
    }
}