class Solution {
    public String countAndSay(int n) {
       return rec(n); 
    }

    public String rec(int n){
       
        if(n==1)return "1";
        
        String str = rec(n-1);     
        StringBuilder res= new StringBuilder();
        int cnt=1;
        char prev = str.charAt(0);
        for(int i=1;i<str.length();i++){
             if(str.charAt(i)==prev){
                cnt++;
             }else{
                res.append(cnt).append(prev);
                prev = str.charAt(i);
                cnt=1;
             }
        }
        res.append(cnt).append(prev);
        return res.toString();
    }
}