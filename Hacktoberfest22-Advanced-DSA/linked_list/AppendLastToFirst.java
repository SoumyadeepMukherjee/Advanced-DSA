package linked_list;

import java.util.Scanner;

public class AppendLastToFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node<Integer> head = LinkedList.takeInput();
        int n = scanner.nextInt();
        head = appendLastNToFirst(head, n);
        LinkedList.printLL(head);
    }

    static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        if (n == 0 || head == null){
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> initialHead = head;

        for (int i = 0; i < n; i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = initialHead;
        head = temp;

        return head;
    }
}
