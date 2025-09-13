class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
               freq[c-'a']++;
        }
        int maxvowel =0;
        int maxcon = 0;
        for(int i=0;i<26;i++){
           if( (i==0 || i==4 || i==8 || i== 14 || i==20) && freq[i]>maxvowel){
            maxvowel=freq[i];
           }
            else if((i!=0 && i!=4 && i!=8 && i!= 14 && i!=20) && freq[i]>maxcon){
            maxcon=freq[i];
            }
        }
        return maxvowel+maxcon;
    }
}