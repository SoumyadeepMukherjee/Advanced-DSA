//code for rotating a linkedlist in java

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      
      //if we have only 1 node or null then return head
        if(head==null || head.next == null || k<1) return head;

      //lets point to the head for iteration over the linked list
        ListNode last = head;
        int len = 1;
        while(last.next!=null){
            len++;
            last = last.next;
        }
      
      //here we have traversed to the last node in our linked list
      //to make it rotated we have to point this last node to our head
      
        last.next = head;
      
      //no of rotations we can make for bigger linked lists is only the remainder by size
      
      /*
      
      for example: if we want to rotate a linked list of size 10 by 10 times then we will get the same linked list
      so we need to rotate by 0 times if we take odd size and even k then we get 1 rotation like for length = 101
      we need to rotate only 1 times as 100th rotation will get us to our original linkedlist
      
      */
        
        int shifts = k % len;
      
      //now we have pointed our rotated node but we need to make the rest sublist i.e 3 point to null
      //so we will get to the last node to the k-1 rotated one
        int skip = len - shifts;
        ListNode newLast = head;
        
        for(int i=1;i<skip;i++){
            newLast = newLast.next;
        }
      
      //here we skipped to the n-k-1 node
      //now this will be our new head
      //and hence to terminate we need to make it point to null
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}
