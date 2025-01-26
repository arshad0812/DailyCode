class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoop {

    // Function to remove loop in the linked list
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected
                breakTheLoop(slow, head);
                return;
            }
        }
    }

    // Function to break the loop
    private static void breakTheLoop(Node loopNode, Node head) {
        Node ptr1 = head;
        Node ptr2 = loopNode;

        // Find the start of the loop
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Find the node before the starting node of the loop
        Node prev = ptr2;
        while (prev.next != ptr2) {
            prev = prev.next;
        }

        // Break the loop
        prev.next = null;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Function to create a loop for testing
    public static void createLoop(Node head, int pos) {
        if (pos == 0) return;

        Node temp = head;
        Node loopNode = null;

        int count = 1;
        while (temp.next != null) {
            if (count == pos) {
                loopNode = temp;
            }
            temp = temp.next;
            count++;
        }

        temp.next = loopNode; // Create the loop
    }

    public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop
        createLoop(head, 3);

        // Removing the loop
        removeLoop(head);

        // Printing the list after loop removal
        printList(head);
    }
}
