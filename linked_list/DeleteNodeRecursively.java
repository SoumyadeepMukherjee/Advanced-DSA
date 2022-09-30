package linked_list;

public class DeleteNodeRecursively {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        LinkedList.printLL(head);
        System.out.println();
        head = deleteNode(head, 4);
        LinkedList.printLL(head);
    }

    static Node<Integer> deleteNode(Node<Integer> head, int pos){
        if (head == null && pos > 0){
            return head;
        }

        if (pos == 0){
            assert head != null;
            head = head.next;
        } else {
            Node<Integer> newNode = deleteNode(head.next, pos - 1);
            head.next = newNode;
        }
        return head;
    }
}
