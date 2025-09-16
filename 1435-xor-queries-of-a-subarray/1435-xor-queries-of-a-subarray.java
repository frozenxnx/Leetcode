class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] ar = new int[m];
      
       for(int i=0;i<queries.length;i++){
        int[] cur = queries[i];
        int start = cur[0];
        int end = cur[1];
          int xor=0;
        for(int j=start;j<=end;j++){
          xor ^= arr[j]; 
        }
        ar[i] = xor;
     }
     return ar;
    }
}