

public class W2D2_ReverseLinkedList {

    /**
     * Reverses a singly linked list iteratively.
     * @param head The head of the original linked list.
     * @return The head of the reversed linked list.
     */
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null; 
        ListNode next = null;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next; 


        }

        return prev; 
    }

    // Main method to test the reversal
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        W2D2_ReverseLinkedList solution = new W2D2_ReverseLinkedList();
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("\nReversed list:");
        printList(reversedHead);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}