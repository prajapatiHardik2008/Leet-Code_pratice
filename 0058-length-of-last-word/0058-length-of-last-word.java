class Solution {
    public int lengthOfLastWord(String s) {
        String tmp = s.split(" ")[s.split(" ").length - 1];
        return tmp.length(); 
    }
}