class BSearch
{
	static Node push(Node head, int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}

	static Node middleNode(Node start, Node last)
	{
		if (start == null)
			return null;

		Node slow = start;
		Node fast = start.next;

		while (fast != last)
		{
			fast = fast.next;
			if (fast != last)
			{
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}


	static Node bSearch(Node head, int value)
	{
		Node start = head;
		Node last = null;

		do
		{
			Node mid = middleNode(start, last);
			if (mid == null)
				return null;
			if (mid.data == value)
				return mid;
			else if (mid.data > value)
			{
				start = mid.next;
            }
			else
				last = mid;
		} while (last == null || last != start);

		return null;
	}

	public static void main(String[] args)
	{
		Node head = null;
		head = push(head, 1);
		head = push(head, 4);
		head = push(head, 7);
		head = push(head, 8);
		head = push(head, 9);
		head = push(head, 10);
		int value = 7;

		if (bSearch(head, value) == null)
		{
			System.out.println("Value not present");
		}
		else
		{
			System.out.println("Present");
		}
	}
}
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
