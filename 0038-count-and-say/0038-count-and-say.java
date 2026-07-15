class Solution {
    public String countAndSay(int n) {
        if (n == 1)
        {
            return "1";
        }

        String prev = countAndSay(n - 1);

        String ans = "";
        int count = 1;
        char curr = prev.charAt(0);

        for(int i = 1; i< prev.length(); i++)
        {
            if(curr == prev.charAt(i))
            {
                count++;
            }
            else{
                ans += count;
                ans += curr;
                curr = prev.charAt(i);
                count = 1;
            }
        }
        ans += count;
        ans += curr;
        return ans;
    }
}