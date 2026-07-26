class Solution {
    public int maximumProduct(int[] nums) {
        int maxFirst = Integer.MIN_VALUE , maxSec = Integer.MIN_VALUE , maxTh = Integer.MIN_VALUE  ;
        int minFi = Integer.MAX_VALUE,sec = Integer.MAX_VALUE;
        for(int ele :  nums)
        {
            if(ele > maxFirst)
            {
                maxTh = maxSec;
                maxSec = maxFirst;
                maxFirst = ele;
            }
            else if(ele > maxSec)
            {
                maxTh = maxSec;
                maxSec = ele; 
            }
            else if(ele > maxTh )
            {
                maxTh = ele;
            }
        
             if (ele < minFi) {
                 sec = minFi;
                 minFi = ele;
             } else if (ele < sec) {
                sec = ele; 
             }
        }
        if(nums.length <= 3)
        {
            return maxFirst * maxSec * maxTh;
        }
        else
        {
        return Math.max(maxFirst * maxSec * maxTh, maxFirst * minFi * sec);
        }
    }
}