class Solution {
    public int[] getNoZeroIntegers(int n) {      
        for(int i=1;i<n;i++){
            int j =n-i;
            if(zero(i) && zero(j))
            return new int[]{i,j};
    }
      return new int[]{0};
    }
    public boolean zero(int k){
        while(k>0){
            int d = k%10;
            if(d==0)return false;
            k=k/10;
        }
        return true;
    }
}