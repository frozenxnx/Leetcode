class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt=0;
        HashSet<Character> set = new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            set.add(c);
        }
        String[] str = text.split(" ");
        for(String word:str){
            for(char j:word.toCharArray()){
                if(set.contains(j)){
                    cnt++;
                    break;
                }
            }
        }
      return str.length-cnt;

    }
}