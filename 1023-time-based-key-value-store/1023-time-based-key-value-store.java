class TimeMap {

    HashMap<String, List<Pair<String, Integer>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair<String, Integer>(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res ="";
        if(map.containsKey(key) == true){
            List<Pair<String, Integer>> temp = map.get(key);

            int low = 0;
            int high = temp.size()-1;

            while(low<=high){
                int mid = (low + high) / 2; 

                if(temp.get(mid).getValue() <= timestamp){
                    res = temp.get(mid).getKey();
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */