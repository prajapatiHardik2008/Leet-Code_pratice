class Solution {
    public int findNumbers(int[] nums) {
        String s = "";
        int c = 0;
        for(int n : nums)
        {
            s = ""+n;           
            if(s.length() %2 == 0)
            {
                c++;
            }
        }
        return  c;
    }
}