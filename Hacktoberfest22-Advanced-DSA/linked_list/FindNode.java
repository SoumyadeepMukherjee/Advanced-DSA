package linked_list;

import java.util.Scanner;

public class FindNode {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Index of given value in the linked list is: " + findNode(head, n));
    }

    static int findNode(Node<Integer> head, int data){
        Node<Integer> temp = head;
        int pos = 0;
        while (temp != null){
            if (temp.data == data){
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }
}
