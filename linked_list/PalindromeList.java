package linked_list;

public class PalindromeList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedList.takeInput();
        LinkedList.printLL(head);
        System.out.println();
        System.out.println(Solution.isPalindrome(head));
    }
}

class Solution{
    // method to reverse the linked list
    private static Node<Integer> reverseList(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }
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

    // method to check palindrome
    public static Boolean isPalindrome(Node<Integer> head){
        if (head == null || head.next == null){
            return true;
        }

        Node<Integer> fast = head;
        // this pointer will reach the middle of the list
        Node<Integer> slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse the list
        slow = reverseList(slow);
        Node<Integer> tempNode = head;

        while (slow != null){
            if (slow.data == tempNode.data){
                slow = slow.next;
                tempNode = tempNode.next;
            } else {
                return false;
            }
        }
        return true;
    }

    /*
      A non-optimised solution could be using a stack to store all the elements of the list and then popping the
      elements one by one and comparing to the elements of the list.
      This would take O(n) space and time complexity

      Whereas here I have coded the optimised solution which uses a space complexity of O(1) and time complexity of
      O(n). Here we use the Hare - Tortoise approach to get to the middle of the list and then reverse the list in
      order to compare the last elements to the starting elements of the list.
     */
}
