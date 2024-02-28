package Problems;

import LinkedList.ListNode;

class Solution{
    public ListNode removeNthNode(ListNode head, int n){
        if(head.next == null){
            return null;
        }
        //size
        ListNode curr = head;
        int size =0;
        while(curr!= null){
            curr = curr.next;
            size++;
        }
        if(size== n){
            return head.next;
        }
        ListNode perv = head;
        int i=1;
        int indexOfSearch = size-n;
        while(i<indexOfSearch){
            perv = perv.next;
            i++;
        }
        perv.next = perv.next.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(4);
        System.out.println("Original List:");
        printList(head);
        head = solution.removeNthNode(head, 2);
        System.out.println("Modified List:");
        printList(head);
    }
}