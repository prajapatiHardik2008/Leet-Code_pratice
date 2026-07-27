class Solution {
    public int maxProduct(int[] nums) {
        int fMax = 0;
        int sMax = 0; 
        for(int ele : nums)
        {
            if(ele > fMax)
            {
                sMax = fMax;
                fMax = ele;
            }
            else if(ele  > sMax)
            {
                sMax = ele;
            }
        }
    return (fMax -1)* (sMax - 1);
    }
}