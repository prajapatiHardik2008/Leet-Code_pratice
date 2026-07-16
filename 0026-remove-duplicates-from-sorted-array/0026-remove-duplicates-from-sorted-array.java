class Solution {
    public int removeDuplicates(int[] nums) {
        int co = 1;
        for(int i = 1; i< nums.length; i++)
        {
            if(nums[i - 1] != nums[i] )
            {
                nums[co] = nums[i];
                co++;
            }
        }   
        return co;
    }
}