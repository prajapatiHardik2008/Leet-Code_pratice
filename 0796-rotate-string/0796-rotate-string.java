class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }
        String conc = s + s;
        return conc.contains(goal);   
    }
}