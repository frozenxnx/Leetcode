class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        private Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer,Node> m = new HashMap<>();
    int cap;
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    public LRUCache(int capacity) {
        cap = capacity;
        head .next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node n = m.get(key);
            int ans= n.val;

            m.remove(key);
            deletenode(n);
            addnode(n);
            m.put(key,head.next);
            return ans;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node cur = m.get(key);
            m.remove(key);
            deletenode(cur);
        }
        if(m.size()==cap){
            m.remove(tail.prev.key);
            deletenode(tail.prev);
        }
        addnode(new Node(key,value));
        m.put(key,head.next);
    }

    private void addnode(Node nn){
        Node temp = head.next;
        nn.next = temp;
        nn.prev = head;

        head.next = nn;
        temp.prev = nn;
    }
     private void deletenode(Node nn){
         Node prev  = nn.prev;
         Node next =  nn.next;

         prev.next = next;
         next.prev = prev;
     }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */