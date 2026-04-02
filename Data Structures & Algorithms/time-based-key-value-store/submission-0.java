class TimeMap {
    HashMap<String,List<pair>> map; 
    public TimeMap() {
      map = new HashMap<>();   
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<pair> list = map.get(key);
        int left =0;
        int right = list.size()-1;

        String res = "";

        while(left<=right){
            int mid = left+(right-left)/2;

            if(list.get(mid).timestamp<=timestamp){
                res = list.get(mid).value;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }

    class pair{
        int timestamp;
        String value;

        pair(int t,String v){
            timestamp = t;
            value = v;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */