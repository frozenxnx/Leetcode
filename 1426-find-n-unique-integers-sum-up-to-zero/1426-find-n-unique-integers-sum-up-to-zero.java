class Solution {
    public int[] sumZero(int n) {
        int[] ar = new int[n];
        if((n%2)!=0){
            ar[n/2]=0;
        }
       for(int i=0;i<n/2;i++){
        ar[i] = -i-1;
        ar[n-i-1] = i+1;
       } 
       return ar;
    }
}