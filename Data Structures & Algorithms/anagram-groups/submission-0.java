class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
     

       for(String s: strs){
        char[] w = s.toCharArray();

        Arrays.sort(w);

        String d = new String(w);

        if(!hm.containsKey(d)){
        hm.put(d,hm.getOrDefault(d,new ArrayList<>()));
        }
        hm.get(d).add(s);
       }
        return new ArrayList<>(hm.values());
    }
}
