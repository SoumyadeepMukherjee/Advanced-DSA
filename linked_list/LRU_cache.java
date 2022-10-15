import java.util.HashMap;

class Node {
	int key;
	int value;
	Node pre;
	Node next;

	public Node(int key, int value)
	{
		this.key = key;
		this.value = value;
	}
}

class LRUCache {
	private HashMap<Integer, Node> map;
	private int capacity, count;
	private Node head, tail;

	public LRUCache(int capacity)
	{
		this.capacity = capacity;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.pre = head;
		head.pre = null;
		tail.next = null;
		count = 0;
	}

	public void deleteNode(Node node)
	{
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}

	public void addToHead(Node node)
	{
		node.next = head.next;
		node.next.pre = node;
		node.pre = head;
		head.next = node;
	}

	// This method works in O(1)
	public int get(int key)
	{
		if (map.get(key) != null) {
			Node node = map.get(key);
			int result = node.value;
			deleteNode(node);
			addToHead(node);
			System.out.println("Got the value : " + result + " for the key: " + key);
			return result;
		}
		System.out.println("Did not get any value" + " for the key: " + key);
		return -1;
	}

	// This method works in O(1)
	public void set(int key, int value)
	{
		System.out.println("Going to set the (key, " + "value) : (" + key + ", " + value + ")");
		if (map.get(key) != null) {
			Node node = map.get(key);
			node.value = value;
			deleteNode(node);
			addToHead(node);
		}
		else {
			Node node = new Node(key, value);
			map.put(key, node);
			if (count < capacity) {
				count++;
				addToHead(node);
			}
			else {
				map.remove(tail.pre.key);
				deleteNode(tail.pre);
				addToHead(node);
			}
		}
	}
}

public class TestLRUCache {
	public static void main(String[] args)
	{
		System.out.println("Going to test the LRU " + " Cache Implementation");
		LRUCache cache = new LRUCache(2);

		cache.set(1, 10);

		cache.set(2, 20);
		System.out.println("Value for the key: 1 is " + cache.get(1)); 

		cache.set(3, 30);

		System.out.println("Value for the key: 2 is " + cache.get(2)); 
    
		cache.set(4, 40);
		System.out.println("Value for the key: 1 is "	+ cache.get(1)); 
		System.out.println("Value for the key: 3 is " + cache.get(3)); 
		System.out.println("Value for the key: 4 is " + cache.get(4)); 
	}
}
