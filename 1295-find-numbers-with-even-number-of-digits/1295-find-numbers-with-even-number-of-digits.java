class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums)
        {       
            if(String.valueOf(n).length() %2 == 0)
            {
                c++;
            }
        }
        return  c;
    }
}