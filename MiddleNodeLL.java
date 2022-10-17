 public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null || head.next == null){
            return head;
        }
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
