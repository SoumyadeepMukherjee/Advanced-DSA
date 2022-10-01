package linked_list;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    private Node<Integer> solve(Node<Integer> list1, Node<Integer> list2){
        if(list1.next == null){
            list1.next = list2;
        } else {
            Node<Integer> curr1 = list1;
            Node<Integer> next1 = curr1.next;
            Node<Integer> curr2 = list2;
            Node<Integer> next2;

            while (next1 != null && curr2 != null){
                if (curr2.data >= curr1.data && curr2.data <= next1.data){
                    curr1.next = curr2;
                    next2 = curr2.next;
                    curr2.next = next1;
                    curr1 = curr2;
                    curr2 = next2;
                } else {
                    curr1 = next1;
                    next1 = next1.next;
                    if (next1 == null){
                        curr1.next = curr2;
                        return list1;
                    }
                }
            }
        }
        return list1;
    }

    Node<Integer> merge(Node<Integer> list1, Node<Integer> list2){
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.data <= list2.data){
            return solve(list1, list2);
        } else {
            return solve(list2, list1);
        }
    }
}
