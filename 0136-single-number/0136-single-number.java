class Solution {
    public int singleNumber(int[] nums) {
        int uniq = 0;
        for( int num : nums)
        {
            uniq = uniq ^ num;  
        }// End loop 
        return uniq;
    }
}