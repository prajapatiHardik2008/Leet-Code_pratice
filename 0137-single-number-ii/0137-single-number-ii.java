class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer , Integer> numset = new HashMap<>(); 
       for(int ele: nums)
       {
            if(numset.containsKey(ele))
            {
                numset.put(ele, numset.get(ele) + 1);
            }
            else{
                numset.put(ele,1);
            }
       } 
       int ans = -1;

        for (Map.Entry<Integer, Integer> entry : numset.entrySet()) {
            if (entry.getValue() < 3) {
                ans = entry.getKey();
                break;
            }
        }
    return ans;
    }
}