package linked_list;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node<Integer> head = takeInput();
        printLL(head);
        System.out.println();
        /**
         // the value of head is incremented
         increment(head);
         System.out.println(head.data);
         */
//        System.out.println(lengthOfLL(head));
        printIthNode(head, 0);

        int pos = scanner.nextInt();
//        int data = scanner.nextInt();
//        head = insertNode(head, data, pos);
        head = deleteNode(head, pos);
        printLL(head);
    }

    static int lengthOfLL(Node<Integer> head) {
        Node<Integer> temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void increment(Node<Integer> head) {
        head.data++;
    }

    static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int j = 0;
        while (temp != null && j < i) {
            temp = temp.next;
            j++;
        }
        if (temp != null) {
            System.out.println(temp.data);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    static Node<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = head;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = scanner.nextInt();
        }
        return head;
    }

    static Node<Integer> insertNode(Node<Integer> head, int data, int pos) {
        int currPos = 0;
        Node<Integer> temp = head;
        Node<Integer> newNode = new Node<>(data);
        // case 1: insertion at head/beginning
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        while (temp != null && currPos < (pos - 1)) {
            temp = temp.next;
            currPos++;
        }
        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        int currPos = 0;
        Node<Integer> temp = head;
        if (pos == 0) {
            head = head.next;
            return head;
        }
        while (temp != null && currPos < pos - 1) {
            temp = temp.next;
            currPos++;
        }
        if (temp == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(5);
        Node<Integer> n4 = new Node<>(2);
        Node<Integer> n5 = new Node<>(6);
        Node<Integer> n6 = new Node<>(1);
        Node<Integer> n7 = new Node<>(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        return n1;
    }
}
