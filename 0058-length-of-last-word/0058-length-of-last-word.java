class Solution {
    public int lengthOfLastWord(String s) {
       // Index , or length 
       // in this prog. we'll remove the space from last 
       int index = 0;
       int len = s.length() - 1;
       while( len >= 0 && s.charAt(len)==' ')
       {
        len--;
       }

       while(len >= 0 && s.charAt(len) != ' ')
       {
        index++;
        len--;
       }
       return index;
    }
}