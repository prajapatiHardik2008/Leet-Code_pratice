class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums)
        {
            String s = ""+n;
            if(s.length() %2 == 0)
            {
                c++;
            }
        }
        return  c;
    }
}