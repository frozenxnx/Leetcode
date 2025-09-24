class Solution {
    public int evenNumberBitwiseORs(int[] nums){
        int xor=0;
        for(int i:nums){
            if((i%2)==0){
                xor=xor | i;
            }
        }
        return xor;
    }
}