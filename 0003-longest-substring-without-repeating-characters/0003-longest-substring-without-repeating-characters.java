class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        HashSet<Character> setchar = new HashSet<>();
        int left = 0;
        int count = 0 ;
        for(int right = 0 ;right < s.length(); right++)
        {
            while(setchar.contains(s.charAt(right)))
            {
                setchar.remove(s.charAt(left));
                left++;
            }
            setchar.add(s.charAt(right));
            count = Math.max(count , right - left + 1);
        }
        return count;
    
    }
}