class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int u : nums){
            hm.put(u,hm.getOrDefault(u,0)+1);
        }

       
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for(int m : hm.keySet()){
           pq.add(m);
        }

        int[] arr = new int[k];

           for(int i=0; i<k;i++){
            arr[i]= pq.poll();
           }

           return arr;
  }
}