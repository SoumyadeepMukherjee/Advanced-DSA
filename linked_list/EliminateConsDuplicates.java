package linked_list;

import java.util.Objects;

public class EliminateConsDuplicates {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        LinkedList.printLL(head);
        System.out.println();
        removeDuplicates(head);
        LinkedList.printLL(head);
    }
    static Node<Integer> removeDuplicates(Node<Integer> head){
        if (head == null){
            return null;
        }
        Node<Integer> currNode = head;
        while (currNode.next != null){
            if (currNode.data.equals(currNode.next.data)) {
                // remove node
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
