package linked_list;

public class PrintReverseLL {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        LinkedList.printLL(head);
        System.out.println();
        head = printReverse(head);
        LinkedList.printLL(head);
        System.out.println();
        head = printReverseIterative(head);
        LinkedList.printLL(head);
    }

    // recursive approach has more complexity
    static Node<Integer> printReverse(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }
        Node<Integer> newHead = printReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // iterative approach
    static Node<Integer> printReverseIterative(Node<Integer> head){
        Node<Integer> currNode = head;
        Node<Integer> prevNode = null;
        while (currNode != null){
            Node<Integer> tempNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tempNode;
        }
        return prevNode;
    }
}
