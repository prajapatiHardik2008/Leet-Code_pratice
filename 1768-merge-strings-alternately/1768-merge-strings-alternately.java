class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i;
        
        for(i = 0 ; i < Math.min(word1.length() , word2.length() ) ; i++)
        {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if( i < word1.length())
        {
            res.append(word1.substring(i));
        }
        else if (i <  word2.length())
        {
            res.append(word2.substring(i));
        }
        return res.toString();
    }
}