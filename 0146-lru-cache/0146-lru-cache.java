class Node{
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int _key, int _val){
        key = _key;
        val = _val;
        prev = null;
        next = null;
    }
}

class LRUCache {

    private int cap;
    private Map<Integer, Node> cache;
    private Node oldest;
    private Node latest;

    public LRUCache(int capacity) {
        cap = capacity;
        cache = new HashMap<>();
        oldest = new Node(0,0);
        latest = new Node(0,0);
        oldest.next = latest;
        latest.prev = oldest;
    }
    
    private void insertAfterHead(Node node){
        Node prev = latest.prev;
        Node next = latest;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    private void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    } 

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            deleteNode(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insertAfterHead(newNode);

        if(cache.size() > cap){
            Node lru = oldest.next;
            deleteNode(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */