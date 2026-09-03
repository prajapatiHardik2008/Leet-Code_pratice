class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> dic = new HashMap<>();
        HashSet<String> used = new HashSet<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
        {
            return false;
        }
        for(int i = 0 ; i < pattern.length() ; i++)
        {
            if(!dic.containsKey(pattern.charAt(i))   )
            {
                if(used.contains(words[i])){
                    return false;
                }

                dic.put(pattern.charAt(i),words[i]);
                used.add(words[i]);
                    
            }
            else{
                if( words[i].equals(dic.get(pattern.charAt(i))) )
                {
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}