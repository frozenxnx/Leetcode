class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int key=0;
         for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() > (n/2)){
                key = entry.getKey();
            }
        }
        return key;
    }
}