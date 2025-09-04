class Solution {
    public int compress(char[] chars) {
       int i=0;
       int index=0;
       while(i<chars.length){
        char c = chars[i];
        int cnt=0;
        while(i<chars.length && chars[i] == c){
            cnt++;
            i++;
        }
        chars[index++]=c;
        if(cnt>1){
            String str = String.valueOf(cnt);
            for(char d:str.toCharArray()){
                chars[index++] = d;
            }     
        }
       } 
       return index;     
    }
}