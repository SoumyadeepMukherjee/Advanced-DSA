package linked_list;

public class MidPointLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        System.out.println(midPoint(head).data);
    }

    static Node<Integer> midPoint(Node<Integer> head){
        // We use Floyd's Tortoise and Hare algorithm to solve this problem (a cycle detection algo)
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
