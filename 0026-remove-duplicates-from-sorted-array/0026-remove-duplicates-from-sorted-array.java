class Solution {
    public int removeDuplicates(int[] nums) {
        int co = 0;
        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] != nums[co] )
            {
                co++;
                nums[co] = nums[i];
            }
        }   
        return co + 1;
    }
}