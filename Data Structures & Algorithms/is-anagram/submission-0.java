class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;

       char[] a = s.toCharArray();
       char[] b = t.toCharArray();

       int[] freq = new int[26];

       for(char u: a){
         freq[u-'a']++;
       }

     for(char k: b){
         freq[k-'a']--;
       }


       
     for(int f: freq){
        if(f!=0) return false;
     }
      return true;
    }
}
