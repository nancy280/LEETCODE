class Node
{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int k,int v)
    {
        key=k;
        val=v;
        next=null;
        prev=null;
    }

}
class LRUCache {
    int capacity;
    HashMap<Integer,Node> cacheMap = new HashMap<Integer,Node>();
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        cacheMap = new HashMap<Integer,Node>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node keynode=cacheMap.get(key);
        remove(keynode);
        add(keynode);
        return keynode.val;
    }
    
    public void put(int key, int value) {
        if(cacheMap.containsKey(key)){
            remove(cacheMap.get(key));
        }

        Node node=new Node(key,value);
        add(node);
        cacheMap.put(key,node);
        if(cacheMap.size()>capacity){
        cacheMap.remove(tail.prev.key);
        remove(tail.prev);
        }
    }
    public void remove(Node n)
    {
        Node prev=n.prev;
        Node next=n.next;
        prev.next=next;
        next.prev=prev;
    }
    public void add(Node n)
    {
        Node next=head.next;
        n.next=next;
        next.prev=n;
        head.next=n;
        n.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */