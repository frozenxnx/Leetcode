class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        PriorityQueue<Character> pq = new PriorityQueue<>();
         char[] c = s.toCharArray();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                pq.add(s.charAt(i));
                c[i] = '.';
            }
        }
        for(int i=0;i<n;i++){
            if(c[i]=='.'){
                c[i] = pq.poll();
            }
        }
        return new String(c);
    }
}