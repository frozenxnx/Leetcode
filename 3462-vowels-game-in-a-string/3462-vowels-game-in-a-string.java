class Solution {
    public boolean doesAliceWin(String s) {
       int n = s.length();
       int count=0;
       for(char c:s.toCharArray()){
        if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
         return true;
       }
       }
       return false;
}
    }
