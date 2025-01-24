
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


public class DetectLoop {


    
    public static boolean hasLoop(ListNode head) {
        if (head == null) return false;

        ListNode slow = head; // Slow pointer
        ListNode fast = head; // Fast pointer

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop
    }

    public static void main(String[] args) {
        // Example: Creating a linked list with a loop
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a loop: 5 -> 2 (pos = 2)
        head.next.next.next.next.next = head.next;

        // Checking if the linked list contains a loop
        boolean result = hasLoop(head);
        System.out.println("Does the linked list have a loop? " + result); // Output: true
    }
}
