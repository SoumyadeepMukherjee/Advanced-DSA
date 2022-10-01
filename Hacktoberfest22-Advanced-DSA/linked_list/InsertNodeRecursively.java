package linked_list;

public class InsertNodeRecursively {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        LinkedList.printLL(head);
        System.out.println();
        head = insert(head, 20, 8);
        LinkedList.printLL(head);
    }

    static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode;
        if (head == null && pos > 0){
            return head;
        }
        if (pos == 0){
            newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        } else {
            assert head != null;
            newNode = insert(head.next, data, pos - 1);
            head.next = newNode;
        }
        return head;
    }
}
